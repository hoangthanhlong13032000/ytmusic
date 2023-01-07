package htlong.learn.domain.usecases.favourite

import htlong.learn.domain.entities.AudioDetail
import htlong.learn.domain.repositories.IAudioRepo

class SearchFavouriteAudioUseCase(private val audioRepo: IAudioRepo) {
    suspend operator fun invoke(query: String): ArrayList<AudioDetail> = audioRepo.searchFavourite(query = query)
}