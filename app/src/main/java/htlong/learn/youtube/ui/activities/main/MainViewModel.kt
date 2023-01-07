package htlong.learn.youtube.ui.activities.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainViewModel private constructor() : ViewModel() {
    class Factory : ViewModelProvider.NewInstanceFactory() {
        override fun <T : ViewModel> create(modelClass: Class<T>) = MainViewModel() as T
    }
}