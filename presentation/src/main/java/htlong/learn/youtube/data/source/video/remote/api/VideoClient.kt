package htlong.learn.youtube.data.source.video.remote.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

object VideoClient {
    val youtube: VideoApi by lazy {
        Retrofit.Builder()
            .baseUrl("http://192.168.1.25:3333/api/video/youtube")
            .client(OkHttpClient())
            .addConverterFactory(ScalarsConverterFactory.create())
            .build()
            .create(VideoApi::class.java)
    }
}
