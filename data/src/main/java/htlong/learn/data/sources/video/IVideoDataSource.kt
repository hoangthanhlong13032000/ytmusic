package htlong.learn.youtube.data.source.video

import htlong.learn.domain.entities.ResponseEntities
import htlong.learn.youtube.utils.Enums

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
        suspend fun search(q: String): ResponseEntities.Search
        suspend fun getByID(id: String): ResponseEntities.Video
        suspend fun getByType(type: Enums.VideoType): ResponseEntities.Search
    }
}