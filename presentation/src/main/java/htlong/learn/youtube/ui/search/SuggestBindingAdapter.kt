package htlong.learn.youtube.ui.search

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import htlong.learn.youtube.data.model.ApiResponse
import htlong.learn.youtube.ui.search.recycleview.suggest.SuggestAdapter

@BindingAdapter("suggestQueryResponse")
fun bindSuggests(recyclerView: RecyclerView, sqResponse: ApiResponse.SuggestQuery?) {
    (recyclerView.adapter as? SuggestAdapter)?.apply {
        sqResponse?.let {
            this.updateSuggestQueryResponse(it)
        }
    }
}