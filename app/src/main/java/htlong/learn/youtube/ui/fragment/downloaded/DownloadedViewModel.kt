package htlong.learn.youtube.ui.fragment.downloaded

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DownloadedViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is downloaded Fragment"
    }
    val text: LiveData<String> = _text
}