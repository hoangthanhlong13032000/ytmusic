package htlong.learn.youtube.ui.fragment.downloaded

import androidx.fragment.app.viewModels
import htlong.learn.youtube.databinding.FragmentDownloadedBinding
import htlong.learn.youtube.ui.base.BaseFragment

class DownloadedFragment : BaseFragment<FragmentDownloadedBinding>(
    FragmentDownloadedBinding::inflate
) {

    override val viewModel: DownloadedViewModel by viewModels {
        DownloadedViewModel.Factory()
    }

    override fun initUI() {

    }

    override fun initViewModel() {
        viewModel.text.observe(viewLifecycleOwner) {
            binding.textDownloaded.text = it
        }
    }
}