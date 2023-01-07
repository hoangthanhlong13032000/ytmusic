package htlong.learn.domain.usecases.online

import htlong.learn.domain.entities.AudioQuery
import htlong.learn.domain.repositories.IAudioRepo

class SearchAudioByQueryUseCase(private val videoRepo: IAudioRepo) {
    suspend operator fun invoke(query: String): AudioQuery = videoRepo.searchOnline(query = query)
}