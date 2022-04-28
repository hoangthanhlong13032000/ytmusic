package htlong.learn.domain.usecases.video

import htlong.learn.domain.entities.VideoQuery
import htlong.learn.domain.repositories.IVideoRepo

class SearchVideoByQueryUseCase(private val videoRepo: IVideoRepo) {
    suspend operator fun invoke(query: String): VideoQuery = videoRepo.search(query = query)
}