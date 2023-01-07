package htlong.learn.youtube.data.source.video;

import java.lang.System;

/**
 * - interface's purpose: Youtube video source
 *
 * @author HTLong
 * @edit_at 06/04/2022
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lhtlong/learn/youtube/data/source/video/IVideoDataSource;", "", "Local", "Remote", "presentation_debug"})
public abstract interface IVideoDataSource {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lhtlong/learn/youtube/data/source/video/IVideoDataSource$Local;", "", "presentation_debug"})
    public static abstract interface Local {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lhtlong/learn/youtube/data/source/video/IVideoDataSource$Remote;", "", "getByID", "Lhtlong/learn/youtube/data/model/ApiResponse$Video;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getByType", "Lhtlong/learn/youtube/data/model/ApiResponse$Search;", "type", "Lhtlong/learn/youtube/utils/Enums$VideoType;", "(Lhtlong/learn/youtube/utils/Enums$VideoType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "q", "presentation_debug"})
    public static abstract interface Remote {
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Object search(@org.jetbrains.annotations.NotNull()
        java.lang.String q, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super htlong.learn.youtube.data.model.ApiResponse.Search> continuation);
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Object getByID(@org.jetbrains.annotations.NotNull()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super htlong.learn.youtube.data.model.ApiResponse.Video> continuation);
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Object getByType(@org.jetbrains.annotations.NotNull()
        htlong.learn.youtube.utils.Enums.VideoType type, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super htlong.learn.youtube.data.model.ApiResponse.Search> continuation);
    }
}