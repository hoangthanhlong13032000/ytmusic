package htlong.learn.youtube.ui.search.recycleview.suggest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lhtlong/learn/youtube/ui/search/recycleview/suggest/SuggestAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lhtlong/learn/youtube/ui/search/recycleview/suggest/SuggestViewHolder;", "sqResponse", "Lhtlong/learn/youtube/data/model/ApiResponse$SuggestQuery;", "clickItemListener", "Lkotlin/Function2;", "", "", "", "clickEndButtonListener", "(Lhtlong/learn/youtube/data/model/ApiResponse$SuggestQuery;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateSuggestQueryResponse", "presentation_debug"})
public final class SuggestAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<htlong.learn.youtube.ui.search.recycleview.suggest.SuggestViewHolder> {
    private htlong.learn.youtube.data.model.ApiResponse.SuggestQuery sqResponse;
    private final kotlin.jvm.functions.Function2<java.lang.String, java.lang.Boolean, kotlin.Unit> clickItemListener = null;
    private final kotlin.jvm.functions.Function2<java.lang.String, java.lang.Boolean, kotlin.Unit> clickEndButtonListener = null;
    
    public SuggestAdapter(@org.jetbrains.annotations.NotNull()
    htlong.learn.youtube.data.model.ApiResponse.SuggestQuery sqResponse, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> clickItemListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> clickEndButtonListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public htlong.learn.youtube.ui.search.recycleview.suggest.SuggestViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    htlong.learn.youtube.ui.search.recycleview.suggest.SuggestViewHolder holder, int position) {
    }
    
    public final void updateSuggestQueryResponse(@org.jetbrains.annotations.NotNull()
    htlong.learn.youtube.data.model.ApiResponse.SuggestQuery sqResponse) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
}