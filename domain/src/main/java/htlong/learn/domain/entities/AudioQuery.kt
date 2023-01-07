package htlong.learn.domain.entities

data class AudioQuery (
    var query: String,
    var suggests: ArrayList<AudioDetail>
)