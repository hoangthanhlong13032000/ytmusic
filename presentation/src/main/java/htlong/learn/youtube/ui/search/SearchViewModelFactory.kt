package htlong.learn.youtube.ui.search;

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import htlong.learn.youtube.data.repository.suggestquery.SuggestQueryRepo

class SearchViewModelFactory(private val suggestQueryRepo: SuggestQueryRepo): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(SearchViewModel::class.java)) {
            return SearchViewModel(suggestQueryRepo) as T
        }
        throw IllegalArgumentException("SearchViewModelFactory require a SearchViewModel class")
    }
}