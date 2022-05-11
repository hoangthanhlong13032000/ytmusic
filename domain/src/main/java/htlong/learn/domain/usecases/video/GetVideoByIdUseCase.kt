package htlong.learn.domain.usecases.video

import htlong.learn.domain.entities.VideoEntities
import htlong.learn.domain.repositories.IVideoRepo

class GetVideoByIdUseCase(private val videoRepo: IVideoRepo) {
    suspend operator fun invoke(id: String): VideoEntities.Info? = videoRepo.getByID(id = id)
}