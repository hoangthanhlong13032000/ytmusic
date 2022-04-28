package htlong.learn.youtube.ui.base

import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapter<T, VH : BaseViewHolder<T>> : RecyclerView.Adapter<VH>() {
    private var items: List<T> = emptyList()

    fun setItemList(items: List<T>?) {
        this.items = items ?: emptyList()
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBindData(item = items[position], position = position)
    }

    override fun getItemCount(): Int = items.size
}