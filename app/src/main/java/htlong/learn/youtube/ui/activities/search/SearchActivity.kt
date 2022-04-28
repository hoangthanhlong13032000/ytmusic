package htlong.learn.youtube.ui.activities.search

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import androidx.activity.viewModels
import htlong.learn.domain.entities.SuggestQuery
import htlong.learn.domain.entities.VideoQuery
import htlong.learn.youtube.YoutubeApplication
import htlong.learn.youtube.common.Extensions.hideSoftKeyboard
import htlong.learn.youtube.common.Extensions.showToast
import htlong.learn.youtube.databinding.ActivitySearchBinding
import htlong.learn.youtube.ui.base.BaseActivity
import htlong.learn.youtube.ui.recycleview.suggestquery.SuggestQueryAdapter
import htlong.learn.youtube.ui.recycleview.suggestvideo.SuggestVideoAdapter

class SearchActivity : BaseActivity<ActivitySearchBinding>(
    ActivitySearchBinding::inflate
) {
    /**
     * - Desc: define viewModel by ViewModelFactory
     *
     * @author HTLong
     * @edit_at 24/04/2022
     */
    private val viewModel: SearchViewModel by viewModels {
        (application as YoutubeApplication).let { app ->
            SearchViewModel.SearchViewModelFactory(
                getSuggestQueryUseCase = app.getSuggestQueryUseCase,
                saveHistoriesQueryUseCase = app.saveHistoriesQueryUseCase,
                searchVideoByQueryUseCase = app.searchVideoByQueryUseCase
            )
        }
    }

    override fun initUI() {
        initViewModelUI()
        initRecSuggestUI()
        initSearchUI()
        initOtherUI()
    }

    private fun initViewModelUI() {
        binding.lifecycleOwner = this
        binding.vm = viewModel.also {
            it.query.observe(this) { _ -> it.suggest() }
        }
    }

    private fun initRecSuggestUI() {
        binding.run {
            sgQueryRecSuggest.adapter = SuggestQueryAdapter(
                suggestQuery = SuggestQuery(),
                clickItemListener = { q, _ ->
                    autoCompleteQuery(q)
                    search()
                },
                clickEndButtonListener = { q, isHistory ->
                    if (isHistory) {
                        viewModel.removeQueryFromHistories(q)?.let { pos ->
                            sgQueryRecSuggest.adapter?.notifyItemRemoved(pos)
                        }
                    } else autoCompleteQuery(q)
                }
            )
            sgVideoRecSuggest.adapter = SuggestVideoAdapter(
                videoQuery = VideoQuery()
            ) { vDetails ->
                showToast(vDetails.title)
            }
        }
    }

    private fun initSearchUI() {
        binding.run {
            btnClear.setOnClickListener {
                edtSearch.setText("")
                edtSearch.requestFocus()
                val imm: InputMethodManager =
                    getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                imm.showSoftInput(edtSearch, InputMethodManager.SHOW_IMPLICIT)
            }
            btnSearch.setOnClickListener { search() }
            edtSearch.run {
                setOnEditorActionListener { _, id, _ ->
                    if (id == EditorInfo.IME_ACTION_SEARCH) search()
                    false
                }
                onFocusChangeListener = View.OnFocusChangeListener { _, isFocus ->
                    if (!isFocus) hideSoftKeyboard(this)
                    else viewModel.suggest()
                }
            }
        }
    }

    private fun initOtherUI() {
        binding.run {
            btnBack.setOnClickListener { finish() }
            btnRetry.setOnClickListener { viewModel.search() }
        }
    }

    private fun autoCompleteQuery(q: String) {
        val newQ = viewModel.getQuery(q)
        binding.edtSearch.run {
            setText(newQ)
            setSelection(newQ.length)
        }
    }

    private fun search() {
        viewModel.search()
        viewModel.saveHistoriesQuery()
        binding.edtSearch.clearFocus()
    }

    companion object {
        fun getIntent(context: Context) = Intent(context, SearchActivity::class.java)
    }
}
