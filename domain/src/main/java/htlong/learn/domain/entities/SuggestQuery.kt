package htlong.learn.domain.entities

data class SuggestQuery(
    var query: String,
    var suggests: ArrayList<String>
)
