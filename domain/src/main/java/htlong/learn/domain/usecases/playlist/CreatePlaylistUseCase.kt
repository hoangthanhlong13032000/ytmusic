package htlong.learn.domain.usecases.playlist

import htlong.learn.domain.entities.Playlist
import htlong.learn.domain.repositories.IPlaylistRepo

class CreatePlaylistUseCase(private val playlistRepo: IPlaylistRepo) {
    suspend operator fun invoke(name: String, desc: String): Playlist = playlistRepo.create(name = name, desc = desc)
}