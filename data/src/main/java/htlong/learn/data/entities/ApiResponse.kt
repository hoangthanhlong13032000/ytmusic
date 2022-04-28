package htlong.learn.data.entities

import htlong.learn.domain.entities.VideoEntities

interface ApiResponse {
    data class VideoSearched(
        val status: Int = 0,
        val data: List<VideoEntities.Details> = listOf(),
        val message: String = ""
    )

    data class Video(
        val status: Int = 0,
        val data: VideoEntities.Info? = null,
        val message: String = ""
    )
}