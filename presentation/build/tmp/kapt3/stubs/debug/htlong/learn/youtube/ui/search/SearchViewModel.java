package htlong.learn.youtube.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tJ\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\t\u00a2\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0019"}, d2 = {"Lhtlong/learn/youtube/ui/search/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "suggestQueryRepo", "Lhtlong/learn/youtube/data/repository/suggestquery/SuggestQueryRepo;", "(Lhtlong/learn/youtube/data/repository/suggestquery/SuggestQueryRepo;)V", "_suggestQueryResponse", "Landroidx/lifecycle/MutableLiveData;", "Lhtlong/learn/youtube/data/model/ApiResponse$SuggestQuery;", "query", "", "getQuery", "()Landroidx/lifecycle/MutableLiveData;", "setQuery", "(Landroidx/lifecycle/MutableLiveData;)V", "suggestQueryResponse", "Landroidx/lifecycle/LiveData;", "getSuggestQueryResponse", "()Landroidx/lifecycle/LiveData;", "q", "removeQueryFromHistories", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "search", "", "suggest", "presentation_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    private final htlong.learn.youtube.data.repository.suggestquery.SuggestQueryRepo suggestQueryRepo = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> query;
    private final androidx.lifecycle.MutableLiveData<htlong.learn.youtube.data.model.ApiResponse.SuggestQuery> _suggestQueryResponse = null;
    
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    htlong.learn.youtube.data.repository.suggestquery.SuggestQueryRepo suggestQueryRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getQuery() {
        return null;
    }
    
    public final void setQuery(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<htlong.learn.youtube.data.model.ApiResponse.SuggestQuery> getSuggestQueryResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String q) {
        return null;
    }
    
    public final void suggest() {
    }
    
    public final void search() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer removeQueryFromHistories(@org.jetbrains.annotations.NotNull()
    java.lang.String q) {
        return null;
    }
}