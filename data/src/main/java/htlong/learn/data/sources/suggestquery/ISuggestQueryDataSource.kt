package htlong.learn.data.sources.suggestquery

import htlong.learn.domain.entities.SuggestQuery


/**
 * - interface's purpose: interface datasource for suggest queries api
 * 
 * @author HTLong
 * @edit_at 01/04/2022
 */
interface ISuggestQueryDataSource {
    interface Local {
        suspend fun getAll(): SuggestQuery
        suspend fun save(q: String)
        suspend fun save(histories: List<String>)
    }

    interface Remote {
        suspend fun suggest(q: String): SuggestQuery
    }
}