package htlong.learn.domain.repositories

import htlong.learn.domain.entities.VideoEntities
import htlong.learn.domain.entities.VideoQuery

interface IVideoRepo {
    suspend fun getByID(id: String): VideoEntities.Info
    suspend fun search(query: String): VideoQuery
    suspend fun save(video: VideoEntities.Info)
}