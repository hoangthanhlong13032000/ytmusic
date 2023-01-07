package htlong.learn.youtube.ui.fragment.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class HomeViewModel private constructor() : ViewModel() {
//    private val _text = MutableLiveData<String>().apply { value = "This is home Fragment" }
//    val text: LiveData<String> = _text
//
//    private val _video = MutableLiveData<IVideoEntities.Info>()
//    val video: LiveData<IVideoEntities.Info> = _video
//
    class Factory : ViewModelProvider.NewInstanceFactory() {
        override fun <T : ViewModel> create(modelClass: Class<T>) = HomeViewModel() as T
    }
}