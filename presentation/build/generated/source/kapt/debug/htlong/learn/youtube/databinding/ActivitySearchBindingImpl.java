package htlong.learn.youtube.databinding;
import htlong.learn.youtube.R;
import htlong.learn.youtube.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySearchBindingImpl extends ActivitySearchBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.btn_back, 3);
        sViewsWithIds.put(R.id.ll_search, 4);
        sViewsWithIds.put(R.id.btn_clear, 5);
        sViewsWithIds.put(R.id.btn_search, 6);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edtSearchandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.query.getValue()
            //         is vm.query.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtSearch);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            htlong.learn.youtube.ui.search.SearchViewModel vm = mVm;
            // vm.query != null
            boolean vmQueryJavaLangObjectNull = false;
            // vm.query.getValue()
            java.lang.String vmQueryGetValue = null;
            // vm.query
            androidx.lifecycle.MutableLiveData<java.lang.String> vmQuery = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmQuery = vm.getQuery();

                vmQueryJavaLangObjectNull = (vmQuery) != (null);
                if (vmQueryJavaLangObjectNull) {




                    vmQuery.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivitySearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivitySearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.EditText) bindings[1]
            , (android.widget.LinearLayout) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            );
        this.edtSearch.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recSuggest.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vm == variableId) {
            setVm((htlong.learn.youtube.ui.search.SearchViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable htlong.learn.youtube.ui.search.SearchViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmSuggestQueryResponse((androidx.lifecycle.LiveData<htlong.learn.youtube.data.model.ApiResponse.SuggestQuery>) object, fieldId);
            case 1 :
                return onChangeVmQuery((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmSuggestQueryResponse(androidx.lifecycle.LiveData<htlong.learn.youtube.data.model.ApiResponse.SuggestQuery> VmSuggestQueryResponse, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmQuery(androidx.lifecycle.MutableLiveData<java.lang.String> VmQuery, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String vmQueryGetValue = null;
        htlong.learn.youtube.data.model.ApiResponse.SuggestQuery vmSuggestQueryResponseGetValue = null;
        androidx.lifecycle.LiveData<htlong.learn.youtube.data.model.ApiResponse.SuggestQuery> vmSuggestQueryResponse = null;
        htlong.learn.youtube.ui.search.SearchViewModel vm = mVm;
        androidx.lifecycle.MutableLiveData<java.lang.String> vmQuery = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (vm != null) {
                        // read vm.suggestQueryResponse
                        vmSuggestQueryResponse = vm.getSuggestQueryResponse();
                    }
                    updateLiveDataRegistration(0, vmSuggestQueryResponse);


                    if (vmSuggestQueryResponse != null) {
                        // read vm.suggestQueryResponse.getValue()
                        vmSuggestQueryResponseGetValue = vmSuggestQueryResponse.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (vm != null) {
                        // read vm.query
                        vmQuery = vm.getQuery();
                    }
                    updateLiveDataRegistration(1, vmQuery);


                    if (vmQuery != null) {
                        // read vm.query.getValue()
                        vmQueryGetValue = vmQuery.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtSearch, vmQueryGetValue);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtSearch, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtSearchandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            htlong.learn.youtube.ui.search.SuggestBindingAdapterKt.bindSuggests(this.recSuggest, vmSuggestQueryResponseGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.suggestQueryResponse
        flag 1 (0x2L): vm.query
        flag 2 (0x3L): vm
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}