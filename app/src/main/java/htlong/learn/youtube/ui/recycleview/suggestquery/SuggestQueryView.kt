package htlong.learn.youtube.ui.recycleview.suggestquery

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import htlong.learn.youtube.R
import htlong.learn.youtube.common.Extensions.getMDrawable
import htlong.learn.youtube.databinding.ItemSuggestQueryBinding

class SuggestQueryView(context: Context?, attrs: AttributeSet? = null) : LinearLayout(context, attrs) {
    var binding = ItemSuggestQueryBinding.inflate(LayoutInflater.from(context), this)

    var text = ""
        set(value) {
            field = value
            binding.txtSuggest.text = value
        }
    var isHistory = false
        set(value) {
            field = value
            val startIcon =
                if (value) context.getMDrawable(R.drawable.ic_history_black_24dp)
                else context.getMDrawable(R.drawable.ic_search_black_24dp)

            val endIcon =
                if (value) R.drawable.ic_close_black_20dp
                else R.drawable.ic_arrow_up_left_black_20dp

            binding.txtSuggest.setCompoundDrawablesWithIntrinsicBounds(startIcon, null, null, null)
            binding.btnEnd.setImageResource(endIcon)
        }

    init {
        layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
    }
}