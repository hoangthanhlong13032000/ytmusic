package htlong.learn.youtube.ui.base

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<T> (view: View): RecyclerView.ViewHolder(view) {
    abstract fun onBindData(item: T, position: Int)
}