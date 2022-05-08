package htlong.learn.youtube.ui.fragment.downloaded

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class DownloadedViewModel private constructor() : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is downloaded Fragment"
    }
    val text: LiveData<String> = _text


    class Factory : ViewModelProvider.NewInstanceFactory() {
        override fun <T : ViewModel> create(modelClass: Class<T>) = DownloadedViewModel() as T
    }
}
