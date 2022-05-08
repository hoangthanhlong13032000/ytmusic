package htlong.learn.youtube.ui.fragment.trending

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import htlong.learn.domain.entities.VideoQuery
import htlong.learn.domain.enums.TrendingType
import htlong.learn.domain.usecases.video.GetTrendingUseCase
import htlong.learn.youtube.common.Extensions.launch

class TrendingViewModel(
    private val getTrendingUseCase: GetTrendingUseCase
) : ViewModel() {

    private val _videoQuery = MutableLiveData<VideoQuery>()
    val videoQuery: LiveData<VideoQuery> get() = _videoQuery

    private val _isError = MutableLiveData(false)
    val isError: LiveData<Boolean> get() = _isError

    private val _isLoading = MutableLiveData(true)
    val isLoading: LiveData<Boolean> get() = _isLoading

    var trendingType = TrendingType.NOW


    fun getTrending(type: TrendingType? = null, done: () -> Unit) {
        if (type != null) { // type = null means get with current type
            trendingType = type
            _isLoading.value = true
        }
        launch {
            _isError.value = false
            getTrendingUseCase(trendingType).let {
                _videoQuery.value = it
                if (it.suggests.isEmpty()) _isError.value = true
                _isLoading.value = false
            }
            done()
        }
    }

    class Factory(
        private val getTrendingUseCase: GetTrendingUseCase
    ) : ViewModelProvider.NewInstanceFactory() {
        override fun <T : ViewModel> create(modelClass: Class<T>) = TrendingViewModel(
            getTrendingUseCase
        ) as T
    }
}