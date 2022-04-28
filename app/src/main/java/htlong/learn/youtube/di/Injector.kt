package htlong.learn.youtube.di

import android.content.Context
import htlong.learn.data.datastore.DataStoreHelper
import htlong.learn.data.repositories.SuggestQueryRepo
import htlong.learn.data.repositories.VideoRepo
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

    fun getVideoRepo(context: Context): VideoRepo {
        val videoRemoteDS = VideoRemoteDataSource.getInstance()
        val videoLocalDS = VideoLocalDataSource.getInstance()

        return VideoRepo.getInstance(videoRemoteDS = videoRemoteDS, videoLocalDS = videoLocalDS)
    }
}