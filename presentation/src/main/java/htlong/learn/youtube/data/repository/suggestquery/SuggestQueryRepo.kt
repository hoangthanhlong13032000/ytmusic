package htlong.learn.youtube.data.repository.suggestquery

import htlong.learn.youtube.data.model.ApiResponse
import htlong.learn.youtube.data.source.suggestquery.ISuggestQueryDataSource

class SuggestQueryRepo private constructor(
    private val SQRemoteDS: ISuggestQueryDataSource.Remote,
    private val SQLocalDS: ISuggestQueryDataSource.Local
) :
    ISuggestQueryRepo {
    override suspend fun suggest(query: String): ApiResponse.SuggestQuery {
        return if (query.isBlank()) SQLocalDS.getAll()
        else SQRemoteDS.suggest(q = query)
    }

    override suspend fun save(query: String) {
        SQLocalDS.save(q = query)
    }

    override suspend fun save(histories: List<String>) {
        SQLocalDS.save(histories = histories)
    }

    companion object {
        private var instance: SuggestQueryRepo? = null
        fun getInstance(
            SQRemoteDS: ISuggestQueryDataSource.Remote,
            SQLocalDS: ISuggestQueryDataSource.Local,
        ) = instance ?: SuggestQueryRepo(SQRemoteDS, SQLocalDS).also { instance = it }
    }
}