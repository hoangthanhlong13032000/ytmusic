package htlong.learn.youtube.ui.recycleview.suggestvideo

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout
import com.bumptech.glide.Glide
import htlong.learn.domain.entities.AudioDetail
import htlong.learn.youtube.R
import htlong.learn.youtube.common.Extensions.getMDimension
import htlong.learn.youtube.common.Extensions.getMDrawable
import htlong.learn.youtube.databinding.ItemSuggestVideoBinding

class SuggestVideoView(context: Context?, attrs: AttributeSet? = null) :
    RelativeLayout(context, attrs) {
    var binding = ItemSuggestVideoBinding.inflate(LayoutInflater.from(context), this)

    var videoDetail: AudioDetail? = null
        set(value) {
            if (value != null) {
                field = value
                binding.run {
                    tvVideoTitle.text = value.title
                    tvVideoLength.text = value.lengthInText
                    tvVideoDesc.text = listOf(
                        value.channel.title,
                        value.stats.viewCount,
                        value.publishedTime
                    ).joinToString(separator = " \u00B7 ")

                    value.thumbnails.let {
                        (it.size - 1).let { i ->
                            if (i > -1) Glide.with(context).load(it[i].url).fitCenter().into(ivVideoImg)
                        }
                    }

                    Glide.with(context).load(value.channel.avatar.thumb).circleCrop().into(ivChannelImg)
                }
            }
        }

    init {
        layoutParams = LayoutParams(
            LayoutParams.MATCH_PARENT,
            getContext().getMDimension(R.dimen.height_suggest_video_view)
        )
        background = getContext().getMDrawable(R.drawable.bg_rec_ripple_grey)
    }
}