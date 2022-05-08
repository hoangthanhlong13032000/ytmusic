package htlong.learn.youtube.ui.fragment.playlists

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class PlaylistsViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is playlists Fragment"
    }
    val text: LiveData<String> = _text

    class Factory : ViewModelProvider.NewInstanceFactory() {
        override fun <T : ViewModel> create(modelClass: Class<T>) = PlaylistsViewModel() as T
    }
}