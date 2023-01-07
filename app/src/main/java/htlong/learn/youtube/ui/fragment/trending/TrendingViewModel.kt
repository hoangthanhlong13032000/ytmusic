package htlong.learn.youtube.ui.fragment.trending

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import htlong.learn.domain.usecases.online.GetTrendingAudioUseCase

class TrendingViewModel(
    private val getTrendingAudioUseCase: GetTrendingAudioUseCase
) : ViewModel() {

//    private val _videoQuery = MutableLiveData<IAudioQuery>()
//    val videoQuery: LiveData<IAudioQuery> get() = _videoQuery
//
//    private val _isError = MutableLiveData(false)
//    val isError: LiveData<Boolean> get() = _isError
//
//    private val _isLoading = MutableLiveData(true)
//    val isLoading: LiveData<Boolean> get() = _isLoading
//
//    var trendingType = TrendingType.NOW
//
//
//    fun getTrending(type: TrendingType? = null, done: () -> Unit) {
//        if (type != null) { // type = null means get with current type
//            trendingType = type
//            _isLoading.value = true
//        }
//        launch {
//            _isError.value = false
//            getTrendingAudioUseCase(trendingType).let {
//                _videoQuery.value = it
//                if (it.suggests.isEmpty()) _isError.value = true
//                _isLoading.value = false
//            }
//            done()
//        }
//    }

    class Factory(
        private val getTrendingAudioUseCase: GetTrendingAudioUseCase
    ) : ViewModelProvider.NewInstanceFactory() {
        override fun <T : ViewModel> create(modelClass: Class<T>) = TrendingViewModel(
            getTrendingAudioUseCase
        ) as T
    }
}