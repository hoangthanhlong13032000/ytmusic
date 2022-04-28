package htlong.learn.youtube.data.source.datastore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.google.gson.Gson
import htlong.learn.youtube.utils.Utils
import kotlinx.coroutines.flow.firstOrNull

/**
 * - Object's purpose: save key-value data with datastore
 *
 * @author HTLong
 * @edit_at 03/04/2022
 */

class DataStoreHelper private constructor(context: Context) {
    private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = PREFERENCE_NAME)
    private val dataStore = context.dataStore

    suspend fun getSearchHistories(): List<String> {
        var histories = emptyList<String>()
        try {
            val json = dataStore.data.firstOrNull()?.get(KEY_SEARCH_HISTORIES) ?: "[]"
            histories = Gson().fromJson(json, List::class.java) as List<String>
        } catch (e: Exception) {
            Utils.handleException("get_suggest_query_histories", e)
        }
        return histories
    }

    suspend fun saveSearchHistories(query: String) {
        val q = query.trim()
        if (q.isBlank()) return

        val prevH = getSearchHistories()
        val histories = arrayListOf(q)

        for (h in prevH) {
            if (histories.size >= MAX_SEARCH_HISTORIES_COUNT) break
            if (h != q) histories.add(h)
        }
        saveSearchHistories(histories = histories)
    }

    suspend fun saveSearchHistories(histories: List<String>) {
        try {
            dataStore.edit { prefs ->
                prefs[KEY_SEARCH_HISTORIES] = Gson().toJson(histories)
            }
        } catch (e: Exception) {
            Utils.handleException("save_suggest_query_histories", e)
        }
    }

    companion object {
        const val PREFERENCE_NAME = "datastore"

        const val MAX_SEARCH_HISTORIES_COUNT = 10
        val KEY_SEARCH_HISTORIES = stringPreferencesKey("search_histories")


        private var instance: DataStoreHelper? = null
        fun getInstance(context: Context) =
            instance ?: DataStoreHelper(context).also { instance = it }
    }
}


