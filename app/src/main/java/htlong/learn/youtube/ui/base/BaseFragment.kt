package htlong.learn.youtube.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import htlong.learn.youtube.YoutubeApplication

abstract class BaseFragment<VB : ViewBinding>(
    private val bindingInflater: (inflater: LayoutInflater) -> VB
) : Fragment() {

    protected val app by lazy { requireActivity().application as YoutubeApplication }
    protected val binding by lazy { bindingInflater(layoutInflater) }

    private var isNotYetInit: Boolean = true

    abstract val viewModel: ViewModel
    abstract fun initUI()
    abstract fun initViewModel()

    /**
     * - Desc: false if onBackPress is empty
     *
     * @author HTLong
     * @edit_at 07/05/2022
     */
    open fun onBackPressed() = false
    open fun updateUI() {}

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
            isNotYetInit = false
        }
        updateUI()
    }
}
