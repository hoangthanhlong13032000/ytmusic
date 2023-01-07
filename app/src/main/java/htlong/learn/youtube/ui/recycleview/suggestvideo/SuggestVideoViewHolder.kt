package htlong.learn.youtube.ui.recycleview.suggestvideo

import androidx.recyclerview.widget.RecyclerView
import htlong.learn.domain.entities.AudioDetail

class SuggestVideoViewHolder(
    private val suggestVideoView: SuggestVideoView,
    private val clickItemListener: (AudioDetail) -> Unit,
) : RecyclerView.ViewHolder(suggestVideoView) {

    fun onBindData(audioDetail: AudioDetail) {
        suggestVideoView.videoDetail = audioDetail
        suggestVideoView.binding.root.setOnClickListener {
            clickItemListener(audioDetail)
        }
    }
}