package htlong.learn.youtube.data.source.suggestquery.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lhtlong/learn/youtube/data/source/suggestquery/remote/SuggestQueryRemoteDatasource;", "Lhtlong/learn/youtube/data/source/suggestquery/ISuggestQueryDataSource$Remote;", "()V", "server", "", "suggest", "Lhtlong/learn/youtube/data/model/ApiResponse$SuggestQuery;", "q", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "presentation_debug"})
public final class SuggestQueryRemoteDatasource implements htlong.learn.youtube.data.source.suggestquery.ISuggestQueryDataSource.Remote {
    private int server = 0;
    @org.jetbrains.annotations.NotNull()
    public static final htlong.learn.youtube.data.source.suggestquery.remote.SuggestQueryRemoteDatasource.Companion Companion = null;
    private static htlong.learn.youtube.data.source.suggestquery.remote.SuggestQueryRemoteDatasource instance;
    
    private SuggestQueryRemoteDatasource() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object suggest(@org.jetbrains.annotations.NotNull()
    java.lang.String q, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super htlong.learn.youtube.data.model.ApiResponse.SuggestQuery> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lhtlong/learn/youtube/data/source/suggestquery/remote/SuggestQueryRemoteDatasource$Companion;", "", "()V", "instance", "Lhtlong/learn/youtube/data/source/suggestquery/remote/SuggestQueryRemoteDatasource;", "getInstance", "presentation_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final htlong.learn.youtube.data.source.suggestquery.remote.SuggestQueryRemoteDatasource getInstance() {
            return null;
        }
    }
}