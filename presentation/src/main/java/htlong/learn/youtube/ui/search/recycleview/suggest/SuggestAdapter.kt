package htlong.learn.youtube.ui.search.recycleview.suggest

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import htlong.learn.youtube.data.model.ApiResponse

class SuggestAdapter(
    private var sqResponse: ApiResponse.SuggestQuery,
    private val clickItemListener: (String, Boolean) -> Unit,
    private val clickEndButtonListener: (String, Boolean) -> Unit,
) : RecyclerView.Adapter<SuggestViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuggestViewHolder {
        val view = SuggestView(parent.context)
        return SuggestViewHolder(view, clickItemListener, clickEndButtonListener)
    }

    override fun onBindViewHolder(holder: SuggestViewHolder, position: Int) {
        holder.onBindData(sqResponse.isHistory, sqResponse.suggests[position])
    }

    fun updateSuggestQueryResponse(sqResponse: ApiResponse.SuggestQuery) {
        this.sqResponse = sqResponse
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = sqResponse.suggests.size
}
