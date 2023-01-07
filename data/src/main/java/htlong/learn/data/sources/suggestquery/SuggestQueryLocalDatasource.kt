package htlong.learn.data.sources.suggestquery

import htlong.learn.data.local.datastore.DataStoreHelper

class SuggestQueryLocalDatasource
private constructor(private val dataStoreHelper: DataStoreHelper) : ISuggestQueryDataSource.Local {

    override suspend fun getSaved(): ArrayList<String> {
        return ArrayList(dataStoreHelper.getSetString(key = KEY).toList())
    }

    override suspend fun save(histories: ArrayList<String>): Boolean {
        return dataStoreHelper.saveSetString(key = KEY, value = histories.toSet())
    }

    override suspend fun remove(query: String): Boolean {
        return dataStoreHelper.removeString(key = KEY)
    }

    override suspend fun clear(): Boolean {
        return dataStoreHelper.clear()
    }

    companion object {
        const val KEY = "SUGGEST_QUERY_KEY"
        private var instance: SuggestQueryLocalDatasource? = null
        fun getInstance(dataStoreHelper: DataStoreHelper) =
            instance ?: SuggestQueryLocalDatasource(dataStoreHelper).also { instance = it }
    }
}