package htlong.learn.youtube.ui.search

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import androidx.lifecycle.ViewModelProvider
import htlong.learn.youtube.data.di.Injector
import htlong.learn.youtube.data.model.ApiResponse
import htlong.learn.youtube.databinding.ActivitySearchBinding
import htlong.learn.youtube.ui.base.BaseActivity
import htlong.learn.youtube.ui.search.recycleview.suggest.SuggestAdapter

class SearchActivity : BaseActivity<ActivitySearchBinding>(
    ActivitySearchBinding::inflate
) {
    private lateinit var viewModel: SearchViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewModel()
        initRecSuggest()
        initOtherUI()
    }

    private fun initViewModel() {
        val suggestQueryRepo = Injector.getSuggestQueryRepo(baseContext)
        val factory = SearchViewModelFactory(suggestQueryRepo)

        viewModel = ViewModelProvider(this, factory)[SearchViewModel::class.java]

        binding.lifecycleOwner = this
        binding.vm = viewModel.also {
            it.query.observe(this) { _ -> it.suggest() }
        }
    }

    private fun initRecSuggest() {
        binding.run {
            recSuggest.adapter = SuggestAdapter(
                sqResponse = ApiResponse.SuggestQuery("", false, emptyList()),
                clickItemListener = { q, _ ->
                    val newQ = viewModel.getQuery(q)
                    edtSearch.setText(newQ)
                    edtSearch.setSelection(newQ.length)
                },
                clickEndButtonListener = { q, isHistory ->
                    if (isHistory) {
                        viewModel.removeQueryFromHistories(q)?.let {
                            recSuggest.adapter?.notifyItemRemoved(it)
                        }
                    } else {
                        val newQ = viewModel.getQuery(q)
                        edtSearch.setText(newQ)
                        edtSearch.setSelection(newQ.length)
                    }
                }
            )
        }
    }

    private fun initOtherUI() {
        binding.run {
            btnBack.setOnClickListener { onBackPressed() }
            btnClear.setOnClickListener { edtSearch.setText("") }
            btnSearch.setOnClickListener { viewModel.search() }
            edtSearch.setOnEditorActionListener { _, id, event ->
                if (id == EditorInfo.IME_ACTION_SEARCH) viewModel.search()
                false
            }
        }
    }

    companion object {
        fun getIntent(context: Context) = Intent(context, SearchActivity::class.java)
    }
}
