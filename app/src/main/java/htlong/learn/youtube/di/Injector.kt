package htlong.learn.youtube

import android.content.Context
import htlong.learn.data.datastore.DataStoreHelper
import htlong.learn.data.repositories.SuggestQueryRepo
import htlong.learn.data.sources.suggestquery.SuggestQueryLocalDatasource
import htlong.learn.data.sources.suggestquery.SuggestQueryRemoteDatasource

object Injector {
    fun getSuggestQueryRepo(context: Context): SuggestQueryRepo {
        val dataStoreHelper = DataStoreHelper.getInstance(context)
        val sqRemoteDS = SuggestQueryRemoteDatasource.getInstance()
        val sqLocalDS = SuggestQueryLocalDatasource.getInstance(dataStoreHelper)
        return SuggestQueryRepo.getInstance(sqRemoteDS, sqLocalDS)
    }
//    fun getVideoRepo(context: Context): VideoRe
}