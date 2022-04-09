package htlong.learn.youtube.data.di

import android.content.Context
import htlong.learn.youtube.data.repository.suggestquery.SuggestQueryRepo
import htlong.learn.youtube.data.source.datastore.DataStoreHelper
import htlong.learn.youtube.data.source.suggestquery.local.SuggestQueryLocalDatasource
import htlong.learn.youtube.data.source.suggestquery.remote.SuggestQueryRemoteDatasource

object Injector {
    fun getSuggestQueryRepo(context: Context): SuggestQueryRepo {
        val dataStoreHelper = DataStoreHelper.getInstance(context)
        val sqRemoteDS = SuggestQueryRemoteDatasource.getInstance()
        val sqLocalDS = SuggestQueryLocalDatasource.getInstance(dataStoreHelper)
        return SuggestQueryRepo.getInstance(sqRemoteDS, sqLocalDS)
    }
//    fun getVideoRepo(context: Context): VideoRe
}