package htlong.learn.youtube.data.source.video.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lhtlong/learn/youtube/data/source/video/remote/VideoRemoteDataSource;", "Lhtlong/learn/youtube/data/source/video/IVideoDataSource$Remote;", "()V", "getByID", "Lhtlong/learn/youtube/data/model/ApiResponse$Video;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getByType", "Lhtlong/learn/youtube/data/model/ApiResponse$Search;", "type", "Lhtlong/learn/youtube/utils/Enums$VideoType;", "(Lhtlong/learn/youtube/utils/Enums$VideoType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "q", "Companion", "presentation_debug"})
public final class VideoRemoteDataSource implements htlong.learn.youtube.data.source.video.IVideoDataSource.Remote {
    @org.jetbrains.annotations.NotNull()
    public static final htlong.learn.youtube.data.source.video.remote.VideoRemoteDataSource.Companion Companion = null;
    private static htlong.learn.youtube.data.source.video.remote.VideoRemoteDataSource instance;
    
    private VideoRemoteDataSource() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object search(@org.jetbrains.annotations.NotNull()
    java.lang.String q, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super htlong.learn.youtube.data.model.ApiResponse.Search> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getByType(@org.jetbrains.annotations.NotNull()
    htlong.learn.youtube.utils.Enums.VideoType type, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super htlong.learn.youtube.data.model.ApiResponse.Search> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getByID(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super htlong.learn.youtube.data.model.ApiResponse.Video> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lhtlong/learn/youtube/data/source/video/remote/VideoRemoteDataSource$Companion;", "", "()V", "instance", "Lhtlong/learn/youtube/data/source/video/remote/VideoRemoteDataSource;", "getInstance", "presentation_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final htlong.learn.youtube.data.source.video.remote.VideoRemoteDataSource getInstance() {
            return null;
        }
    }
}