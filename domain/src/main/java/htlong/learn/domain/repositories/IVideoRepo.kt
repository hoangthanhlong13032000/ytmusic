package htlong.learn.domain.repositories

import htlong.learn.domain.entities.VideoEntities
import htlong.learn.domain.entities.VideoQuery
import htlong.learn.domain.enums.TrendingType

interface IVideoRepo {
    suspend fun getByID(id: String): VideoEntities.Info?
    suspend fun getTrending(type: TrendingType): VideoQuery
    suspend fun search(query: String): VideoQuery
    suspend fun save(video: VideoEntities.Info)
}