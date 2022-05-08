package htlong.learn.domain.usecases.video

import htlong.learn.domain.entities.VideoQuery
import htlong.learn.domain.enums.TrendingType
import htlong.learn.domain.repositories.IVideoRepo

class GetTrendingUseCase(private val videoRepo: IVideoRepo) {
    suspend operator fun invoke(type: TrendingType): VideoQuery = videoRepo.getTrending(type)
}