package htlong.learn.domain.usecases.online

import htlong.learn.domain.entities.AudioQuery
import htlong.learn.domain.enums.TrendingType
import htlong.learn.domain.repositories.IAudioRepo

class GetTrendingAudioUseCase(private val audioRepo: IAudioRepo) {
    suspend operator fun invoke(type: TrendingType): AudioQuery {
        return when (type) {
            TrendingType.NOW -> audioRepo.queryTrending()
            TrendingType.MUSIC -> audioRepo.queryMusic()
            TrendingType.SPORT -> audioRepo.querySport()
            TrendingType.GAMING -> audioRepo.queryGaming()
        }
    }
}