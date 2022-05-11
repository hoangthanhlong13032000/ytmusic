package htlong.learn.youtube

import android.app.Application
import htlong.learn.domain.usecases.suggestquery.GetSuggestQueryUseCase
import htlong.learn.domain.usecases.suggestquery.SaveHistoriesQueryUseCase
import htlong.learn.domain.usecases.video.GetTrendingUseCase
import htlong.learn.domain.usecases.video.GetVideoByIdUseCase
import htlong.learn.domain.usecases.video.SearchVideoByQueryUseCase
import htlong.learn.youtube.di.Injector

class YoutubeApplication : Application() {

    // HTLong: repositories
    private val suggestQueryRepo by lazy { Injector.getSuggestQueryRepo(applicationContext) }
    private val videoRepo by lazy { Injector.getVideoRepo(applicationContext) }


    // HTLong: suggest query use cases
    val getSuggestQueryUseCase by lazy { GetSuggestQueryUseCase(suggestQueryRepo) }
    val saveHistoriesQueryUseCase by lazy { SaveHistoriesQueryUseCase(suggestQueryRepo) }


    // HTLong: video use cases
    val searchVideoByQueryUseCase by lazy { SearchVideoByQueryUseCase(videoRepo) }
    val getTrendingUseCase by lazy { GetTrendingUseCase(videoRepo) }
    val getVideoByIdUseCase by lazy { GetVideoByIdUseCase(videoRepo) }
}