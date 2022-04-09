package htlong.learn.youtube.data.model

interface VideoModel {
    data class Info(
        val videos: List<Media>,
        val videoOnly: List<Media>,
        val audioOnly: List<Media>,
        val recommends: List<Details>,
        val details: Details
    )

    data class Media(
        val url: String = "",
        val mimeType: String = "",
        val container: String = "",
        val quality: String = "",
        val audioQuality: String = "",
        val width: Int = 0,
        val height: Int = 0,
        val hasAudio: Boolean = false,
        val hasVideo: Boolean = false
    )


    data class Details(
        val id: String = "",
        val source: String = "",
        val lengthInText: String = "",
        val lengthInSeconds: String = "",
        val title: String = "",
        val publishedTime: String = "",
        val href: String = "",
        val thumbnails: List<Thumbnail> = listOf(),
        val channel: Channel = Channel(),
        val description: String = "",
        val stats: Stats = Stats()
    )

    data class Thumbnail(
        val url: String = "",
        val width: Int = 0,
        val height: Int = 0
    )

    data class Stats(
        val viewCount: Int = 0,
        val likeCount: Int = 0,
        val shareCount: Int = 0,
        val commentCount: Int = 0
    )

    data class Channel(
        val id: String = "",
        val title: String = "",
        val url: String = "",
        val avatar: Avatar = Avatar()
    )

    data class Avatar(
        val large: String = "",
        val medium: String = "",
        val thumb: String = ""
    )
}