package htlong.learn.youtube.data.repository.video

import htlong.learn.youtube.data.model.ApiResponse

class VideoRepo private constructor() : IVideoRepo{
    override suspend fun search(query: String): ApiResponse.Search {
        TODO("Not yet implemented")
    }
}