package htlong.learn.data.sources.video

import htlong.learn.domain.entities.Audio
import htlong.learn.domain.entities.AudioQuery
import htlong.learn.domain.enums.TrendingType

/**
 * - interface's purpose: Youtube video source
 *
 * @author HTLong
 * @edit_at 06/04/2022
 */
interface IAudioDataSource {
    interface Local {

    }

    interface Remote {
        suspend fun getByID(id: String): Audio?
        suspend fun search(q: String): AudioQuery
        suspend fun getTrending(type: TrendingType): AudioQuery
    }
}