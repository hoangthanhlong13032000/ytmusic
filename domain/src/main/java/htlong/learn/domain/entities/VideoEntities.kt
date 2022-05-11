//package htlong.learn.domain.entities
//
//interface VideoEntities {
//    // all information about a youtube video
//    interface Info(
//        val videos: List<Media>,
//        val videoOnly: List<Media>,
//        val audioOnly: List<Media>,
//        val recommends: List<Details>,
//        val details: Details
//    )
//
//    interface Details {
//        val id: String
//        val source: String
//        val lengthInText: String
//        val lengthInSeconds: String
//        val title: String
//        val publishedTime: String
//        val href: String
//        val thumbnails: List<Thumbnail>
//        val channel: Channel
//        val description: String
//        val stats: Stats
//    }
//
//    // url information
//    data class Media(
//        val url: String = "",
//        val mimeType: String = "",
//        val container: String = "",
//        val quality: String = "",
//        val audioQuality: String = "",
//        val width: Int = 0,
//        val height: Int = 0,
//        val hasAudio: Boolean = false,
//        val hasVideo: Boolean = false
//    )
//
//    // image information
//    data class Thumbnail(
//        val url: String = "",
//        val width: String = "",
//        val height: String = ""
//    )
//
//    // statistic information
//    data class Stats(
//        val viewCount: String = "",
//        val likeCount: String = "",
//        val shareCount: String = "",
//        val commentCount: String = ""
//    )
//
//    // author channel information
//    data class Channel(
//        val id: String = "",
//        val title: String = "",
//        val url: String = "",
//        val avatar: Avatar = Avatar()
//    )
//
//    // author image
//    data class Avatar(
//        val large: String = "",
//        val medium: String = "",
//        val thumb: String = ""
//    )
//}

package htlong.learn.domain.entities

interface VideoEntities {
    // all information about a youtube video
    data class Info(
        val videos: List<Media>,
        val videoOnly: List<Media>,
        val audioOnly: List<Media>,
        val recommends: List<Details>,
        val details: Details
    )

    // details information
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

    // url information
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

    // image information
    data class Thumbnail(
        val url: String = "",
        val width: String = "",
        val height: String = ""
    )

    // statistic information
    data class Stats(
        val viewCount: String = "",
        val likeCount: String = "",
        val shareCount: String = "",
        val commentCount: String = ""
    )

    // author channel information
    data class Channel(
        val id: String = "",
        val title: String = "",
        val url: String = "",
        val avatar: Avatar = Avatar()
    )

    // author image
    data class Avatar(
        val large: String = "",
        val medium: String = "",
        val thumb: String = ""
    )
}