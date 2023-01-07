package htlong.learn.data.sources.video

class VideoLocalDataSource: IAudioDataSource.Local {
    companion object {
        private var instance: VideoLocalDataSource? = null
        fun getInstance() = instance ?: VideoLocalDataSource().also { instance = it }
    }
}