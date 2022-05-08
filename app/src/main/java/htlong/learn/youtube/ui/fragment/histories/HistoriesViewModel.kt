package htlong.learn.youtube.ui.fragment.histories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class HistoriesViewModel private constructor() : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is histories Fragment"
    }
    val text: LiveData<String> = _text

    class Factory : ViewModelProvider.NewInstanceFactory() {
        override fun <T : ViewModel> create(modelClass: Class<T>) = HistoriesViewModel() as T
    }
}