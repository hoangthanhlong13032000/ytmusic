package htlong.learn.youtube.ui.histories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HistoriesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is histories Fragment"
    }
    val text: LiveData<String> = _text
}