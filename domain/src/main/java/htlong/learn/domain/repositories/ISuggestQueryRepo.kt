package htlong.learn.domain.repositories

import htlong.learn.domain.entities.SuggestQuery

interface ISuggestQueryRepo {
    suspend fun suggest(query: String): SuggestQuery
    suspend fun save(query: String)
    suspend fun save(histories: List<String>)
}