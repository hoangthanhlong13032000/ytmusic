package htlong.learn.youtube.data.model

interface ApiResponse {
    data class SuggestQuery(
        val query: String,
        val isHistory: Boolean,
        var suggests: List<String>
    )

    data class Video(
        val status: Int,
        val data: VideoModel.Info,
        val message: String
    )

    data class Search(
        val status: Int,
        val data: List<VideoModel.Details>,
        val message: String
    )
}