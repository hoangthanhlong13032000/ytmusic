package htlong.learn.youtube.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B6\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\r\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH&J\b\u0010\u001d\u001a\u00020\u001bH&J\b\u0010\u001e\u001a\u00020\u0015H\u0016J$\u0010\u001f\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010\'\u001a\u00020\u001bH\u0016R\u001b\u0010\u000f\u001a\u00028\u00008DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R)\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00028\u00018DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006("}, d2 = {"Lhtlong/learn/youtube/ui/base/BaseFragment;", "VB", "Landroidx/viewbinding/ViewBinding;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "bindingInflater", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "Lkotlin/ParameterName;", "name", "inflater", "classViewModel", "Ljava/lang/Class;", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Class;)V", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "binding$delegate", "Lkotlin/Lazy;", "isNotYetInit", "", "viewModel", "getViewModel", "()Landroidx/lifecycle/ViewModel;", "viewModel$delegate", "initListener", "", "initUI", "initViewModel", "onBackPressed", "onCreateView", "Landroid/view/View;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "updateUI", "presentation_debug"})
public abstract class BaseFragment<VB extends androidx.viewbinding.ViewBinding, VM extends androidx.lifecycle.ViewModel> extends androidx.fragment.app.Fragment {
    private final kotlin.jvm.functions.Function1<android.view.LayoutInflater, VB> bindingInflater = null;
    private final java.lang.Class<VM> classViewModel = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private boolean isNotYetInit = true;
    
    public BaseFragment(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.LayoutInflater, ? extends VB> bindingInflater, @org.jetbrains.annotations.NotNull()
    java.lang.Class<VM> classViewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final VB getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final VM getViewModel() {
        return null;
    }
    
    public abstract void initUI();
    
    public abstract void initViewModel();
    
    public void initListener() {
    }
    
    public boolean onBackPressed() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public void updateUI() {
    }
}