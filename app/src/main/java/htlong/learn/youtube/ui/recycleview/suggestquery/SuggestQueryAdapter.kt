package htlong.learn.youtube.ui.recycleview.suggestquery

import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import htlong.learn.domain.entities.SuggestQuery

class SuggestQueryAdapter(
    private var suggestQuery: SuggestQuery,
    private val clickItemListener: (String, Boolean) -> Unit,
    private val clickEndButtonListener: (String, Boolean) -> Unit,
) : RecyclerView.Adapter<SuggestQueryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuggestQueryViewHolder {
        val view = SuggestQueryView(parent.context)
        return SuggestQueryViewHolder(view, clickItemListener, clickEndButtonListener)
    }

    override fun onBindViewHolder(holder: SuggestQueryViewHolder, position: Int) {
        holder.onBindData(suggestQuery.isHistory, suggestQuery.suggests[position])
    }

    fun updateSuggestQueryResponse(suggestQuery: SuggestQuery) {
        this.suggestQuery = suggestQuery
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = suggestQuery.suggests.size
}

@BindingAdapter("suggestQuery")
fun bindSuggests(recyclerView: RecyclerView, suggestQuery: SuggestQuery?) {
    (recyclerView.adapter as? SuggestQueryAdapter)?.apply {
        suggestQuery?.let {
            this.updateSuggestQueryResponse(it)
        }
    }
}
