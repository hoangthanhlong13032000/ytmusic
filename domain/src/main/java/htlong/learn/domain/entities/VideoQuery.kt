package htlong.learn.domain.entities

data class VideoQuery(
    val query: String = "",
    var suggests: List<VideoEntities.Details> = listOf(),
)