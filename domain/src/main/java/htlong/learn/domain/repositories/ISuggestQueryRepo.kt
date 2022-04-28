package htlong.learn.domain.repositories.suggestquery

import htlong.learn.domain.entities.ResponseEntities

interface ISuggestQueryRepo {
    suspend fun suggest(query: String): ResponseEntities.SuggestQuery
    suspend fun save(query: String)
    suspend fun save(histories: List<String>)
}