package htlong.learn.domain.entities

// all information about a youtube audio
data class AudioInfo (
    var url: String,
    var mimeType: String,
    var container: String,
    var quality: String
)