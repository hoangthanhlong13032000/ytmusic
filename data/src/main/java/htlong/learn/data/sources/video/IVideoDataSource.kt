package htlong.learn.data.sources.video

import htlong.learn.domain.entities.VideoEntities
import htlong.learn.domain.entities.VideoQuery
import htlong.learn.domain.enums.TrendingType

/**
 * - interface's purpose: Youtube video source
 *
 * @author HTLong
 * @edit_at 06/04/2022
 */
interface IVideoDataSource {
    interface Local {

    }

    interface Remote {
        suspend fun getByID(id: String): VideoEntities.Info
        suspend fun search(q: String): VideoQuery
        suspend fun save(video: VideoEntities.Info)
        suspend fun getTrending(type: TrendingType): VideoQuery
    }
}