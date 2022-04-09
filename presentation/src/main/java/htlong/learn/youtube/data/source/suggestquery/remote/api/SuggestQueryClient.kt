package htlong.learn.youtube.data.source.suggestquery.remote.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

object SuggestQueryClient {
    val default: SuggestQueryApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://suggestqueries.google.com")
            .client(OkHttpClient())
            .addConverterFactory(ScalarsConverterFactory.create())
            .build()
            .create(SuggestQueryApi::class.java)
    }
    val clients1: SuggestQueryApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://clients1.google.com")
            .client(OkHttpClient())
            .addConverterFactory(ScalarsConverterFactory.create())
            .build()
            .create(SuggestQueryApi::class.java)
    }
    val clients2: SuggestQueryApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://clients2.google.com")
            .client(OkHttpClient())
            .addConverterFactory(ScalarsConverterFactory.create())
            .build()
            .create(SuggestQueryApi::class.java)
    }
    val clients3: SuggestQueryApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://clients3.google.com")
            .client(OkHttpClient())
            .addConverterFactory(ScalarsConverterFactory.create())
            .build()
            .create(SuggestQueryApi::class.java)
    }
}