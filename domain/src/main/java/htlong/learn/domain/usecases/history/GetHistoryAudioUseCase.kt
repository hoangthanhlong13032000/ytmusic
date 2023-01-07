package htlong.learn.domain.usecases.history

import htlong.learn.domain.entities.Audio
import htlong.learn.domain.repositories.IAudioRepo

class GetHistoryAudioUseCase(private val audioRepo: IAudioRepo) {
    suspend operator fun invoke(): ArrayList<Audio> = audioRepo.getAllSaved()
    suspend operator fun invoke(query: String): ArrayList<Audio> = audioRepo.searchOffline(query = query)
}