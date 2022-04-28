package htlong.learn.youtube.ui.recycleview.suggestvideo

import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import htlong.learn.domain.entities.VideoQuery
import htlong.learn.domain.entities.VideoEntities

class SuggestVideoAdapter(
    private var videoQuery: VideoQuery,
    private val clickItemListener: (VideoEntities.Details) -> Unit,
) : RecyclerView.Adapter<SuggestVideoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuggestVideoViewHolder {
        val view = SuggestVideoView(parent.context)
        return SuggestVideoViewHolder(view, clickItemListener)
    }

    override fun onBindViewHolder(holder: SuggestVideoViewHolder, position: Int) {
        holder.onBindData(videoQuery.suggests[position])
    }

    override fun getItemCount(): Int = videoQuery.suggests.size

    fun updateSuggestVideoResponse(videoQuery: VideoQuery) {
        this.videoQuery = videoQuery
        this.notifyDataSetChanged()
    }
}

@BindingAdapter("videoQuery")
fun bindSuggests(recyclerView: RecyclerView, videoQuery: VideoQuery?) {
    (recyclerView.adapter as? SuggestVideoAdapter)?.apply {
        videoQuery?.let {
            this.updateSuggestVideoResponse(it)
            recyclerView.scrollToPosition(0)
        }
    }
}
