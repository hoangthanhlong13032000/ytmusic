package htlong.learn.youtube.ui.downloaded

import htlong.learn.youtube.databinding.FragmentDownloadedBinding
import htlong.learn.youtube.ui.base.BaseFragment

class DownloadedFragment : BaseFragment<FragmentDownloadedBinding, DownloadedViewModel>(
    FragmentDownloadedBinding::inflate,
    DownloadedViewModel::class.java
) {

    override fun initUI() {

    }

    override fun initViewModel() {
        viewModel.text.observe(viewLifecycleOwner) {
            binding.textDownloaded.text = it
        }
    }
}