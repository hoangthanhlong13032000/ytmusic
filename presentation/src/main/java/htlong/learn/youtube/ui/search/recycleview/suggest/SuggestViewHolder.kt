package htlong.learn.youtube.ui.search.recycleview.suggest

import androidx.recyclerview.widget.RecyclerView

class SuggestViewHolder(
    private val suggestView: SuggestView,
    private val clickItemListener: (String, Boolean) -> Unit,
    private val clickEndButtonListener: (String, Boolean) -> Unit
) : RecyclerView.ViewHolder(suggestView) {

    fun onBindData(isHistory: Boolean, suggest: String) {
        suggestView.isHistory = isHistory
        suggestView.text = suggest
        suggestView.binding.txtSuggest.setOnClickListener {
            clickItemListener(suggest, isHistory)
        }
        suggestView.binding.btnEnd.setOnClickListener {
            clickEndButtonListener(suggest, isHistory)
        }
    }
}