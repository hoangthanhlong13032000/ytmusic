package htlong.learn.youtube.data.source.suggestquery;

import java.lang.System;

/**
 * - interface's purpose: interface datasource for suggest queries api
 *
 * @author HTLong
 * @edit_at 01/04/2022
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lhtlong/learn/youtube/data/source/suggestquery/ISuggestQueryDataSource;", "", "Local", "Remote", "presentation_debug"})
public abstract interface ISuggestQueryDataSource {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\u0005\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lhtlong/learn/youtube/data/source/suggestquery/ISuggestQueryDataSource$Local;", "", "getAll", "Lhtlong/learn/youtube/data/model/ApiResponse$SuggestQuery;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "save", "", "q", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "histories", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentation_debug"})
    public static abstract interface Local {
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Object getAll(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super htlong.learn.youtube.data.model.ApiResponse.SuggestQuery> continuation);
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Object save(@org.jetbrains.annotations.NotNull()
        java.lang.String q, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Object save(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> histories, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lhtlong/learn/youtube/data/source/suggestquery/ISuggestQueryDataSource$Remote;", "", "suggest", "Lhtlong/learn/youtube/data/model/ApiResponse$SuggestQuery;", "q", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentation_debug"})
    public static abstract interface Remote {
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Object suggest(@org.jetbrains.annotations.NotNull()
        java.lang.String q, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super htlong.learn.youtube.data.model.ApiResponse.SuggestQuery> continuation);
    }
}