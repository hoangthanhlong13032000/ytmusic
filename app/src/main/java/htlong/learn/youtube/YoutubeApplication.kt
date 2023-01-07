package htlong.learn.youtube

import android.app.Application
import htlong.learn.domain.usecases.suggestquery.GetSuggestQueryUseCase
import htlong.learn.domain.usecases.suggestquery.SaveHistoryQueryUseCase
import htlong.learn.domain.usecases.online.GetTrendingAudioUseCase
import htlong.learn.domain.usecases.online.GetAudioUseCase
import htlong.learn.domain.usecases.online.SearchAudioByQueryUseCase
import htlong.learn.domain.usecases.suggestquery.GetHistoryQueryUseCase
import htlong.learn.domain.usecases.suggestquery.RemoveHistoryQueryUseCase
import htlong.learn.youtube.di.Injector

class YoutubeApplication : Application() {

    // HTLong: repositories
    private val suggestQueryRepo by lazy { Injector.getSuggestQueryRepo(applicationContext) }
    private val videoRepo by lazy { Injector.getVideoRepo(applicationContext) }


    // HTLong: suggest query use cases
    val getSuggestQueryUseCase by lazy { GetSuggestQueryUseCase(suggestQueryRepo) }
    val saveHistoryQueryUseCase by lazy { SaveHistoryQueryUseCase(suggestQueryRepo) }

    val getHistoryQueryUseCase by lazy { GetHistoryQueryUseCase(suggestQueryRepo) }
    val removeHistoryQueryUseCase by lazy {RemoveHistoryQueryUseCase(suggestQueryRepo)}


    // HTLong: video use cases
    val searchAudioByQueryUseCase by lazy { SearchAudioByQueryUseCase(videoRepo) }
    val getTrendingAudioUseCase by lazy { GetTrendingAudioUseCase(videoRepo) }
    val getAudioUseCase by lazy { GetAudioUseCase(videoRepo) }
}