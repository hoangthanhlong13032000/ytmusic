package htlong.learn.youtube.ui.recycleview.suggestvideo

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import htlong.learn.domain.entities.AudioDetail
import htlong.learn.domain.entities.AudioQuery

class SuggestAudioAdapter(
    private val clickItemListener: (AudioDetail) -> Unit,
) : RecyclerView.Adapter<SuggestVideoViewHolder>() {

    private var audioQuery: AudioQuery = AudioQuery(query = "", suggests = arrayListOf())

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuggestVideoViewHolder {
        val view = SuggestVideoView(parent.context)
        return SuggestVideoViewHolder(view, clickItemListener)
    }

    override fun onBindViewHolder(holder: SuggestVideoViewHolder, position: Int) {
        holder.onBindData(audioQuery.suggests[position])
    }

    override fun getItemCount(): Int = audioQuery.suggests.size

    fun refresh(audioQuery: AudioQuery) {
        this.audioQuery = audioQuery
        notifyDataSetChanged()
    }
}