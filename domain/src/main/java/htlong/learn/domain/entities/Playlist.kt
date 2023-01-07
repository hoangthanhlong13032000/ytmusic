package htlong.learn.domain.entities

data class Playlist(
    var id: String,
    var name: String,
    var audios: ArrayList<AudioDetail>
)