package htlong.learn.domain.repositories

import htlong.learn.domain.entities.SuggestQuery


interface ISuggestQueryRepo {
    suspend fun suggest(query: String): SuggestQuery
    suspend fun save(queries: ArrayList<String>): Boolean
    suspend fun getSaved(): ArrayList<String>
    suspend fun remove(query: String): Int
    suspend fun clear(): Boolean
    suspend fun removeAndGetSaved(query: String): ArrayList<String>
}