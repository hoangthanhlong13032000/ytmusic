package htlong.learn.domain.entities

data class SuggestQuery(
    val query: String = "",
    val isHistory: Boolean = false,
    var suggests: List<String> = emptyList()
)
