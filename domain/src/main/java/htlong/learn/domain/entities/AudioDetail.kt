package htlong.learn.domain.entities

data class AudioDetail(
    var id: String,
    var source: String,
    var lengthInText: String,
    var lengthInSeconds: String,
    var title: String,
    var publishedTime: String,
    var href: String,
    var thumbnails: ArrayList<Thumbnail>,
    var channel: Channel,
    var description: String,
    var stats: Stats
)