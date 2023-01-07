package htlong.learn.youtube.ui.recycleview.suggestquery

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import htlong.learn.youtube.models.VSuggestQuery

class SuggestQueryAdapter(
    private val clickItemListener: (String, Boolean) -> Unit,
    private val clickEndButtonListener: (String, Boolean) -> Unit,
) : RecyclerView.Adapter<SuggestQueryViewHolder>() {

    private var suggestQuery: VSuggestQuery = VSuggestQuery()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuggestQueryViewHolder {
        val view = SuggestQueryView(parent.context)
        return SuggestQueryViewHolder(view, clickItemListener, clickEndButtonListener)
    }

    override fun onBindViewHolder(holder: SuggestQueryViewHolder, position: Int) {
        holder.onBindData(suggestQuery.isHistory, suggestQuery.suggests[position])
    }

    override fun getItemCount(): Int = suggestQuery.suggests.size

    fun refresh(suggestQuery: VSuggestQuery) {
        this.suggestQuery = suggestQuery
        notifyDataSetChanged()
    }
}