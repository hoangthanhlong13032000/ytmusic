package htlong.learn.youtube.data.repository.video

import htlong.learn.youtube.data.model.ApiResponse

interface IVideoRepo {
    suspend fun search(query: String): ApiResponse.Search
//    suspend fun sear
}