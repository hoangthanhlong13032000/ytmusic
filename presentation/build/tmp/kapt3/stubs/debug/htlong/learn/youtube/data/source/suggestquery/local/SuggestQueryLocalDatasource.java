package htlong.learn.youtube.data.source.suggestquery.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\b\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lhtlong/learn/youtube/data/source/suggestquery/local/SuggestQueryLocalDatasource;", "Lhtlong/learn/youtube/data/source/suggestquery/ISuggestQueryDataSource$Local;", "dataStoreHelper", "Lhtlong/learn/youtube/data/source/datastore/DataStoreHelper;", "(Lhtlong/learn/youtube/data/source/datastore/DataStoreHelper;)V", "getAll", "Lhtlong/learn/youtube/data/model/ApiResponse$SuggestQuery;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "save", "", "q", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "histories", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "presentation_debug"})
public final class SuggestQueryLocalDatasource implements htlong.learn.youtube.data.source.suggestquery.ISuggestQueryDataSource.Local {
    private final htlong.learn.youtube.data.source.datastore.DataStoreHelper dataStoreHelper = null;
    @org.jetbrains.annotations.NotNull()
    public static final htlong.learn.youtube.data.source.suggestquery.local.SuggestQueryLocalDatasource.Companion Companion = null;
    private static htlong.learn.youtube.data.source.suggestquery.local.SuggestQueryLocalDatasource instance;
    
    private SuggestQueryLocalDatasource(htlong.learn.youtube.data.source.datastore.DataStoreHelper dataStoreHelper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super htlong.learn.youtube.data.model.ApiResponse.SuggestQuery> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object save(@org.jetbrains.annotations.NotNull()
    java.lang.String q, @org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lhtlong/learn/youtube/data/source/suggestquery/local/SuggestQueryLocalDatasource$Companion;", "", "()V", "instance", "Lhtlong/learn/youtube/data/source/suggestquery/local/SuggestQueryLocalDatasource;", "getInstance", "dataStoreHelper", "Lhtlong/learn/youtube/data/source/datastore/DataStoreHelper;", "presentation_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final htlong.learn.youtube.data.source.suggestquery.local.SuggestQueryLocalDatasource getInstance(@org.jetbrains.annotations.NotNull()
        htlong.learn.youtube.data.source.datastore.DataStoreHelper dataStoreHelper) {
            return null;
        }
    }
}