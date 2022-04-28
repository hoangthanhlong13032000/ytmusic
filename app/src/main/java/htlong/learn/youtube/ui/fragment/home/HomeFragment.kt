package htlong.learn.youtube.ui.fragment.home

import htlong.learn.youtube.databinding.FragmentHomeBinding
import htlong.learn.youtube.ui.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(FragmentHomeBinding::inflate, HomeViewModel::class.java) {

    override fun initViewModel() {
        viewModel.text.observe(viewLifecycleOwner) {
            binding.textHome.text = it
        }
    }

    override fun initUI() {

    }
}