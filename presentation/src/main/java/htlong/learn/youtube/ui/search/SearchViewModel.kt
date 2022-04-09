package htlong.learn.youtube.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import htlong.learn.youtube.data.model.ApiResponse
import htlong.learn.youtube.data.repository.suggestquery.SuggestQueryRepo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SearchViewModel(private val suggestQueryRepo: SuggestQueryRepo) : ViewModel() {

    var query: MutableLiveData<String> = MutableLiveData<String>().apply { value = "" }

    private val _suggestQueryResponse = MutableLiveData<ApiResponse.SuggestQuery>()
    val suggestQueryResponse: LiveData<ApiResponse.SuggestQuery> get() = _suggestQueryResponse

    fun getQuery(q: String): String {
        return if (q.startsWith("... "))
            (query.value ?: "").substringBeforeLast(" ") + q.substring(3)
        else q
    }

    fun suggest() {
        CoroutineScope(Dispatchers.IO).launch {
            val q = query.value ?: ""
            var sqRes = suggestQueryRepo.suggest(q)
            if (sqRes.suggests.isEmpty()) {
                sqRes = suggestQueryRepo.suggest(q.substringAfterLast(" "))
                sqRes.suggests = sqRes.suggests.map { "... $it" }
            }
            withContext(Dispatchers.Main) {
                _suggestQueryResponse.value = sqRes
            }
        }
    }

    fun search() {
        CoroutineScope(Dispatchers.IO).launch {
            val q = query.value ?: ""
            suggestQueryRepo.save(query = q)
        }
    }

    fun removeQueryFromHistories(q: String): Int? {
        var pos: Int? = null
        _suggestQueryResponse.value?.run {
            val newSug = mutableListOf<String>()

            suggests.forEachIndexed { i, s ->
                if (s != q) newSug.add(s)
                else pos = i
            }
            suggests = newSug

            CoroutineScope(Dispatchers.IO).launch { suggestQueryRepo.save(histories = newSug) }
        }
        return pos
    }
}

