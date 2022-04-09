package htlong.learn.youtube.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB : ViewBinding, VM: ViewModel>(
    private val bindingInflater: (inflater: LayoutInflater) -> VB,
    private val classViewModel: Class<VM>
) : Fragment() {

    protected val binding by lazy { bindingInflater(layoutInflater) }
    protected val viewModel by lazy { ViewModelProvider(this)[classViewModel] }

    private var isNotYetInit: Boolean = true

    abstract fun initUI()
    abstract fun initViewModel()

    open fun initListener() {}
    open fun onBackPressed(): Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (isNotYetInit) {
            initViewModel()
            initUI()
            initListener()
            isNotYetInit = false
        }
        updateUI()
    }

    open fun updateUI() {}
}