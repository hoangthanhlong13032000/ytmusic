package htlong.learn.youtube.ui.activities.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import htlong.learn.domain.entities.VideoQuery

class MainViewModel() : ViewModel() {

    private val _videoQuery = MutableLiveData<VideoQuery>()
    val videoQuery: LiveData<VideoQuery> get() = _videoQuery

    var isError = MutableLiveData(false)


//    fun getTrending(type: TrendingType) {
//        launch {
//            isError.value = false
//            getTrendingUseCase(type).let {
//                _videoQuery.value = it
//                if (it.suggests.isEmpty()) isError.value = true
//            }
//        }
//    }


    class Factory : ViewModelProvider.NewInstanceFactory() {
        override fun <T : ViewModel> create(modelClass: Class<T>) = MainViewModel() as T
    }
}