package htlong.learn.domain.entities

// all information about a youtube video
data class Audio (
    var infos: ArrayList<AudioInfo>,
    var detail: AudioDetail,
    var recommends: ArrayList<AudioDetail>,
    var date: Long,
)