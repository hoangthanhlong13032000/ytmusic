package htlong.learn.youtube.ui.activities.search

import androidx.lifecycle.*
import htlong.learn.domain.entities.AudioQuery
import htlong.learn.domain.usecases.online.SearchAudioByQueryUseCase
import htlong.learn.domain.usecases.suggestquery.GetHistoryQueryUseCase
import htlong.learn.domain.usecases.suggestquery.GetSuggestQueryUseCase
import htlong.learn.domain.usecases.suggestquery.RemoveHistoryQueryUseCase
import htlong.learn.domain.usecases.suggestquery.SaveHistoryQueryUseCase
import htlong.learn.youtube.common.Extensions.launch
import htlong.learn.youtube.models.VSuggestQuery

class SearchViewModel private constructor(
    private val getSuggestQueryUseCase: GetSuggestQueryUseCase,
    private val getHistoryQueryUseCase: GetHistoryQueryUseCase,
    private val saveHistoryQueryUseCase: SaveHistoryQueryUseCase,
    private val removeHistoryQueryUseCase: RemoveHistoryQueryUseCase,
    private val searchAudioByQueryUseCase: SearchAudioByQueryUseCase
) : ViewModel() {

    private val _suggestQuery = MutableLiveData<VSuggestQuery>()
    val suggestQuery: LiveData<VSuggestQuery> get() = _suggestQuery

    private val _audioQuery = MutableLiveData<AudioQuery>()
    val audioQuery: LiveData<AudioQuery> get() = _audioQuery

    private val _displayMode = MutableLiveData(DisplayMode.SUGGEST_QUERIES)
    val displayMode: LiveData<DisplayMode> get() = _displayMode

    fun setDisplayMode(displayMode: DisplayMode) {
        _displayMode.value = displayMode
    }

    /**
     * - Desc: current query search after process
     *
     * @param subFix if null return current query
     * @param subFix else return q after processed
     *
     * @author HTLong
     * @edit_at 24/04/2022
     */
    fun appendOrReplaceAndGetQuery(query: String, subFix: String? = null): String {
        return when {
            subFix.isNullOrBlank() -> query // return current query if subFix is null
            subFix.startsWith("... ") -> query.substringBeforeLast(" ") + subFix.substring(3) // concatenate subFix and query
            else -> subFix // replace subFix for query
        }
    }


    /**
     * - Desc: get suggest queries list
     *
     * @author HTLong
     * @edit_at 24/04/2022
     */
    fun suggest(query: String) {
        _displayMode.value = DisplayMode.SUGGEST_QUERIES

        launch {
            if (query.isBlank()) {
                _suggestQuery.value = VSuggestQuery(query = query, suggests = getHistoryQueryUseCase(), isHistory = true)
            } else {
                var sgQuery = getSuggestQueryUseCase(query = query)
                if (sgQuery.suggests.isEmpty()) {
                    sgQuery = getSuggestQueryUseCase(query = query.substringAfterLast(" "))
                    sgQuery.suggests = ArrayList(sgQuery.suggests.map { "... $it" })
                }
                _suggestQuery.value = VSuggestQuery(suggestQuery = sgQuery, isHistory = false)
            }
        }
    }


    /**
     * - Desc: search videos list
     *
     * @author HTLong
     * @edit_at 24/04/2022
     */
    fun searchAudioByQuery(query: String) {
        _displayMode.value = DisplayMode.LOADING

        launch {
            saveHistoryQueryUseCase(query = query)
            searchAudioByQueryUseCase(query = query).let {
                _audioQuery.value = it
                if (it.suggests.isEmpty()) _displayMode.value = DisplayMode.ERROR
                else _displayMode.value = DisplayMode.AUDIOS
            }
        }
    }


    /**
     * - Desc: remove a query from history query list
     *
     * @author HTLong
     * @edit_at 24/04/2022
     */
    fun removeQueryFromHistories(query: String): Int? {
        _suggestQuery.value?.run {
            val pos = suggests.indexOf(query)
            if (pos > -1) {
                launch { removeHistoryQueryUseCase(query = query) }
                suggests = ArrayList(suggests).apply { removeAt(pos) }
                return pos
            }
        }
        return null
    }


    /**
     * - class's purpose: ViewModel Factory to create a ViewModel
     *
     * @author HTLong
     * @edit_at 22/04/2022
     */
    class Factory(
        private val getSuggestQueryUseCase: GetSuggestQueryUseCase,
        private val getHistoryQueryUseCase: GetHistoryQueryUseCase,
        private val saveHistoryQueryUseCase: SaveHistoryQueryUseCase,
        private val removeHistoryQueryUseCase: RemoveHistoryQueryUseCase,
        private val searchAudioByQueryUseCase: SearchAudioByQueryUseCase
    ) : ViewModelProvider.NewInstanceFactory() {
        override fun <T : ViewModel> create(modelClass: Class<T>) = SearchViewModel(
            getSuggestQueryUseCase,
            getHistoryQueryUseCase,
            saveHistoryQueryUseCase,
            removeHistoryQueryUseCase,
            searchAudioByQueryUseCase
        ) as T
    }

    companion object {
        private const val SEARCH_VIEW_MODEL = "search_view_model"
    }
}

