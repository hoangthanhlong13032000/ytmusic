package htlong.learn.youtube.ui.activities.search

import android.content.Context
import android.content.Intent
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import com.google.gson.Gson
import htlong.learn.youtube.common.Extensions.hideSoftKeyboard
import htlong.learn.youtube.databinding.ActivitySearchBinding
import htlong.learn.youtube.ui.base.BaseActivity
import htlong.learn.youtube.ui.recycleview.suggestquery.SuggestQueryAdapter
import htlong.learn.youtube.ui.recycleview.suggestvideo.SuggestAudioAdapter

class SearchActivity : BaseActivity<ActivitySearchBinding>(
    ActivitySearchBinding::inflate
) {

    override val viewModel: SearchViewModel by viewModels {
        SearchViewModel.Factory(
            getSuggestQueryUseCase = app.getSuggestQueryUseCase,
            getHistoryQueryUseCase = app.getHistoryQueryUseCase,
            saveHistoryQueryUseCase = app.saveHistoryQueryUseCase,
            removeHistoryQueryUseCase = app.removeHistoryQueryUseCase,
            searchAudioByQueryUseCase = app.searchAudioByQueryUseCase
        )
    }

    override fun initViewModel() {
        binding.lifecycleOwner = this
        viewModel.displayMode.observe(this) { mode ->
            binding.apply {
                // ưu tiên mode gợi ý (luôn hiển thị gợi ý nếu thanh search đang focus)
                if (edtSearch.hasFocus() && mode != DisplayMode.SUGGEST_QUERIES) {
                    viewModel.setDisplayMode(DisplayMode.SUGGEST_QUERIES)
                    return@apply
                }
                sgQueryRecSuggest.isVisible = mode == DisplayMode.SUGGEST_QUERIES
                sgVideoRecSuggest.isVisible = mode == DisplayMode.AUDIOS
                flProgressBar.isVisible = mode == DisplayMode.LOADING
                tvNotFound.isVisible = mode == DisplayMode.ERROR
                btnRetry.isVisible = mode == DisplayMode.ERROR
            }
        }
    }

    override fun initUI() {
        initSuggestQueryUI()
        initAudioQueryUI()
        initSearchUI()
        initOtherUI()
    }

    private fun initSuggestQueryUI() {
        binding.sgQueryRecSuggest.adapter = SuggestQueryAdapter(
            clickItemListener = { q, _ ->
                autoFillSearchEditText(q)
                searchAudio()
            },
            clickEndButtonListener = { query, isHistory ->
                if (isHistory) {
                    viewModel.removeQueryFromHistories(query)?.let { pos ->
                        binding.sgQueryRecSuggest.adapter?.notifyItemRemoved(pos)
                    }
                } else autoFillSearchEditText(query)
            }
        ).apply {
            viewModel.suggestQuery.observe(this@SearchActivity) { suggestQuery ->
                refresh(suggestQuery)
            }
            viewModel.suggest(getSearchText())
        }
    }

    private fun initAudioQueryUI() {
        binding.sgVideoRecSuggest.adapter = SuggestAudioAdapter(clickItemListener = { vDetails ->
            val intent = Intent()
            intent.putExtra(KEY_SEARCH, Gson().toJson(vDetails))
            setResult(RESULT_OK, intent)
            finish()
        }).apply {
            viewModel.audioQuery.observe(this@SearchActivity) { audioQuery ->
                refresh(audioQuery)
            }
        }
    }

    private fun initSearchUI() {
        binding.run {
            btnClear.setOnClickListener {
                edtSearch.setText("")
                edtSearch.requestFocus()
                (getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager).showSoftInput(
                    edtSearch,
                    InputMethodManager.SHOW_IMPLICIT
                )
            }
            btnSearch.setOnClickListener { searchAudio() }
            edtSearch.run {
                // search audio when click search in keyboard
                setOnEditorActionListener { _, id, _ ->
                    if (id == EditorInfo.IME_ACTION_SEARCH) searchAudio()
                    false
                }
                // suggest when user typing
                addTextChangedListener {
                    viewModel.suggest(query = it.toString())
                }
                setOnFocusChangeListener { _, hasFocus ->
                    if (hasFocus) viewModel.setDisplayMode(DisplayMode.SUGGEST_QUERIES)
                    else hideSoftKeyboard(this)
                }
            }
        }
    }

    private fun initOtherUI() {
        binding.run {
            btnBack.setOnClickListener { finish() }
            btnRetry.setOnClickListener { searchAudio() }
        }
    }

    private fun autoFillSearchEditText(q: String) {
        binding.edtSearch.run {
            val newQ = viewModel.appendOrReplaceAndGetQuery(text.toString(), q)
            setText(newQ)
            setSelection(newQ.length)
        }
    }

    private fun searchAudio() {
        binding.edtSearch.clearFocus()
        viewModel.searchAudioByQuery(getSearchText())
    }

    private fun getSearchText(): String {
        return binding.edtSearch.text.toString()
    }

    companion object {
        const val KEY_SEARCH = "KEY_SEARCH"
        fun getIntent(context: Context) = Intent(context, SearchActivity::class.java)
    }
}
