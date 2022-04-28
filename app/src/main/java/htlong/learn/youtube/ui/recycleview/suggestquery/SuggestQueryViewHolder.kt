package htlong.learn.youtube.ui.search.recycleview.suggestquery

import androidx.recyclerview.widget.RecyclerView

class SuggestQueryViewHolder(
    private val suggestQueryView: SuggestQueryView,
    private val clickItemListener: (String, Boolean) -> Unit,
    private val clickEndButtonListener: (String, Boolean) -> Unit
) : RecyclerView.ViewHolder(suggestQueryView) {

    fun onBindData(isHistory: Boolean, suggest: String) {
        suggestQueryView.isHistory = isHistory
        suggestQueryView.text = suggest
        suggestQueryView.binding.txtSuggest.setOnClickListener {
            clickItemListener(suggest, isHistory)
        }
        suggestQueryView.binding.btnEnd.setOnClickListener {
            clickEndButtonListener(suggest, isHistory)
        }
    }
}