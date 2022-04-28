package htlong.learn.youtube.ui.recycleview.suggestvideo

import androidx.recyclerview.widget.RecyclerView
import htlong.learn.domain.entities.VideoEntities

class SuggestVideoViewHolder(
    private val suggestVideoView: SuggestVideoView,
    private val clickItemListener: (VideoEntities.Details) -> Unit,
) : RecyclerView.ViewHolder(suggestVideoView) {

    fun onBindData(videoDetails: VideoEntities.Details) {
        suggestVideoView.videoDetails = videoDetails
        suggestVideoView.binding.root.setOnClickListener {
            clickItemListener(videoDetails)
        }
    }
}