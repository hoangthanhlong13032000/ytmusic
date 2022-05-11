package htlong.learn.youtube.ui.activities.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import htlong.learn.domain.entities.VideoEntities

class MainViewModel private constructor() : ViewModel() {

    var currentVideo: VideoEntities.Info? = null

    class Factory : ViewModelProvider.NewInstanceFactory() {
        override fun <T : ViewModel> create(modelClass: Class<T>) = MainViewModel() as T
    }
}