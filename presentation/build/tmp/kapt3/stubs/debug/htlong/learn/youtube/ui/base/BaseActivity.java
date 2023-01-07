package htlong.learn.youtube.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B(\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u0012\u0010\u000b\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\r\u001a\u00028\u00008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lhtlong/learn/youtube/ui/base/BaseActivity;", "VB", "Landroidx/viewbinding/ViewBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "bindingInflater", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "Lkotlin/ParameterName;", "name", "inflater", "(Lkotlin/jvm/functions/Function1;)V", "_binding", "Landroidx/viewbinding/ViewBinding;", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "presentation_debug"})
public abstract class BaseActivity<VB extends androidx.viewbinding.ViewBinding> extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.jvm.functions.Function1<android.view.LayoutInflater, VB> bindingInflater = null;
    private VB _binding;
    
    public BaseActivity(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.LayoutInflater, ? extends VB> bindingInflater) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final VB getBinding() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}