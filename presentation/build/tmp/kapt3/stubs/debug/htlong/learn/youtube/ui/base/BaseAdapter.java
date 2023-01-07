package htlong.learn.youtube.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u00012\u0006\u0010\r\u001a\u00020\tH\u0016\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u000b2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lhtlong/learn/youtube/ui/base/BaseAdapter;", "T", "VH", "Lhtlong/learn/youtube/ui/base/BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "()V", "items", "", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "(Lhtlong/learn/youtube/ui/base/BaseViewHolder;I)V", "setItemList", "presentation_debug"})
public abstract class BaseAdapter<T extends java.lang.Object, VH extends htlong.learn.youtube.ui.base.BaseViewHolder<T>> extends androidx.recyclerview.widget.RecyclerView.Adapter<VH> {
    private java.util.List<? extends T> items;
    
    public BaseAdapter() {
        super();
    }
    
    public final void setItemList(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends T> items) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    VH holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
}