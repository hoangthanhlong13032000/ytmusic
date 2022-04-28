package htlong.learn.youtube.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import htlong.learn.domain.entities.SuggestQuery
import htlong.learn.domain.entities.VideoQuery
import htlong.learn.domain.usecases.suggestquery.GetSuggestQueryUseCase
import htlong.learn.domain.usecases.suggestquery.SaveHistoriesQueryUseCase
import htlong.learn.domain.usecases.video.SearchVideoByQueryUseCase
import htlong.learn.youtube.common.Extensions.launch

class SearchViewModel(
    private val getSuggestQueryUseCase: GetSuggestQueryUseCase,
    private val saveHistoriesQueryUseCase: SaveHistoriesQueryUseCase,
    private val searchVideoByQueryUseCase: SearchVideoByQueryUseCase
) : ViewModel() {

    var query = MutableLiveData<String>().apply { value = "" }

    private val _suggestQuery = MutableLiveData<SuggestQuery>()
    val suggestQuery: LiveData<SuggestQuery> get() = _suggestQuery

    private val _videoQuery = MutableLiveData<VideoQuery>()
    val videoQuery: LiveData<VideoQuery> get() = _videoQuery

    var isQueryMode = MutableLiveData(true)
    var isLoading = MutableLiveData(false)

    /**
     * - Desc: current query search after process
     *
     * @param q if null return current query
     * @param q else return q after processed
     *
     * @author HTLong
     * @edit_at 24/04/2022
     */
    fun getQuery(q: String? = null): String {
        val curQ = query.value ?: ""
        return when {
            q == null -> curQ // return current query if q is null
            q.startsWith("... ") -> curQ.substringBeforeLast(" ") + q.substring(3) // concatenate q and curQ
            else -> q
        }
    }


    /**
     * - Desc: get suggest queries list
     *
     * @author HTLong
     * @edit_at 24/04/2022
     */
    fun suggest() {
        launch {
            val q = query.value ?: ""

            var sgQuery = getSuggestQueryUseCase(query = q)
            if (sgQuery.suggests.isEmpty()) {
                sgQuery = getSuggestQueryUseCase(query = q.substringAfterLast(" "))
                sgQuery.suggests = sgQuery.suggests.map { "... $it" }
            }
            _suggestQuery.value = sgQuery
            isQueryMode.value = true
        }
    }

    /**
     * - Desc: search videos list
     *
     * @author HTLong
     * @edit_at 24/04/2022
     */
    fun search() {
        query.value?.let { q ->
            isLoading.value = true
            launch {
                searchVideoByQueryUseCase(query = q).let {
                    _videoQuery.value = it
                }
                isLoading.value = false
                isQueryMode.value = false
            }
        }
    }


    /**
     * - Desc: save searched query to history
     *
     * @author HTLong
     * @edit_at 24/04/2022
     */
    fun saveHistoriesQuery(histories: List<String>? = null) {
        launch {
            if (histories != null) saveHistoriesQueryUseCase(histories = histories)
            else saveHistoriesQueryUseCase(query = query.value ?: "")
        }
    }


    /**
     * - Desc: remove a query from history query list
     *
     * @author HTLong
     * @edit_at 24/04/2022
     */
    fun removeQueryFromHistories(q: String): Int? {
        var pos: Int? = null
        _suggestQuery.value?.run {
            suggests = suggests.filterIndexed { i, s ->
                (s != q).also { if (!it) pos = i }
            }
            saveHistoriesQuery(histories = suggests)
        }
        return pos
    }


    /**
     * - class's purpose: Viewmodel Factory to create a ViewModel
     *
     * @author HTLong
     * @edit_at 22/04/2022
     */
    class SearchViewModelFactory(
        private val getSuggestQueryUseCase: GetSuggestQueryUseCase,
        private val saveHistoriesQueryUseCase: SaveHistoriesQueryUseCase,
        private val searchVideoByQueryUseCase: SearchVideoByQueryUseCase
    ) : ViewModelProvider.NewInstanceFactory() {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(SearchViewModel::class.java)) {
                return SearchViewModel(
                    getSuggestQueryUseCase,
                    saveHistoriesQueryUseCase,
                    searchVideoByQueryUseCase
                ) as T
            }
            throw IllegalArgumentException("SearchViewModelFactory require SearchViewModel class")
        }
    }
}

