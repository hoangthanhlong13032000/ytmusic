package htlong.learn.youtube.data.repository.suggestquery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\u0007\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lhtlong/learn/youtube/data/repository/suggestquery/SuggestQueryRepo;", "Lhtlong/learn/youtube/data/repository/suggestquery/ISuggestQueryRepo;", "SQRemoteDS", "Lhtlong/learn/youtube/data/source/suggestquery/ISuggestQueryDataSource$Remote;", "SQLocalDS", "Lhtlong/learn/youtube/data/source/suggestquery/ISuggestQueryDataSource$Local;", "(Lhtlong/learn/youtube/data/source/suggestquery/ISuggestQueryDataSource$Remote;Lhtlong/learn/youtube/data/source/suggestquery/ISuggestQueryDataSource$Local;)V", "save", "", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "histories", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suggest", "Lhtlong/learn/youtube/data/model/ApiResponse$SuggestQuery;", "Companion", "presentation_debug"})
public final class SuggestQueryRepo implements htlong.learn.youtube.data.repository.suggestquery.ISuggestQueryRepo {
    private final htlong.learn.youtube.data.source.suggestquery.ISuggestQueryDataSource.Remote SQRemoteDS = null;
    private final htlong.learn.youtube.data.source.suggestquery.ISuggestQueryDataSource.Local SQLocalDS = null;
    @org.jetbrains.annotations.NotNull()
    public static final htlong.learn.youtube.data.repository.suggestquery.SuggestQueryRepo.Companion Companion = null;
    private static htlong.learn.youtube.data.repository.suggestquery.SuggestQueryRepo instance;
    
    private SuggestQueryRepo(htlong.learn.youtube.data.source.suggestquery.ISuggestQueryDataSource.Remote SQRemoteDS, htlong.learn.youtube.data.source.suggestquery.ISuggestQueryDataSource.Local SQLocalDS) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object suggest(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super htlong.learn.youtube.data.model.ApiResponse.SuggestQuery> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object save(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object save(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> histories, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lhtlong/learn/youtube/data/repository/suggestquery/SuggestQueryRepo$Companion;", "", "()V", "instance", "Lhtlong/learn/youtube/data/repository/suggestquery/SuggestQueryRepo;", "getInstance", "SQRemoteDS", "Lhtlong/learn/youtube/data/source/suggestquery/ISuggestQueryDataSource$Remote;", "SQLocalDS", "Lhtlong/learn/youtube/data/source/suggestquery/ISuggestQueryDataSource$Local;", "presentation_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final htlong.learn.youtube.data.repository.suggestquery.SuggestQueryRepo getInstance(@org.jetbrains.annotations.NotNull()
        htlong.learn.youtube.data.source.suggestquery.ISuggestQueryDataSource.Remote SQRemoteDS, @org.jetbrains.annotations.NotNull()
        htlong.learn.youtube.data.source.suggestquery.ISuggestQueryDataSource.Local SQLocalDS) {
            return null;
        }
    }
}