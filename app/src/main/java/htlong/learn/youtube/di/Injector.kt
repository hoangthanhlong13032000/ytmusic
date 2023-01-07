package htlong.learn.youtube.di

import android.content.Context
import htlong.learn.data.local.datastore.DataStoreHelper
import htlong.learn.data.repositories.SuggestQueryRepo
import htlong.learn.data.repositories.AudioRepo
import htlong.learn.data.sources.suggestquery.SuggestQueryLocalDatasource
import htlong.learn.data.sources.suggestquery.SuggestQueryRemoteDatasource
import htlong.learn.data.sources.video.VideoLocalDataSource
import htlong.learn.data.sources.video.VideoRemoteDataSource

object Injector {
    fun getSuggestQueryRepo(context: Context): SuggestQueryRepo {
        val dataStoreHelper = DataStoreHelper.getInstance(context)
        val sqRemoteDS = SuggestQueryRemoteDatasource.getInstance()
        val sqLocalDS = SuggestQueryLocalDatasource.getInstance(dataStoreHelper)
        return SuggestQueryRepo.getInstance(SQRemoteDS = sqRemoteDS, SQLocalDS = sqLocalDS)
    }

    fun getVideoRepo(context: Context): AudioRepo {
        val videoRemoteDS = VideoRemoteDataSource.getInstance()
        val videoLocalDS = VideoLocalDataSource.getInstance()

        return AudioRepo.getInstance(videoRemoteDS = videoRemoteDS, videoLocalDS = videoLocalDS)
    }
}