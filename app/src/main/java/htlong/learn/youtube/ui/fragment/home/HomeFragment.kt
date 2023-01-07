package htlong.learn.youtube.ui.fragment.home

import androidx.fragment.app.viewModels
import htlong.learn.youtube.databinding.FragmentHomeBinding
import htlong.learn.youtube.ui.activities.main.MainActivity
import htlong.learn.youtube.ui.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    override val viewModel: HomeViewModel by viewModels {
        HomeViewModel.Factory()
    }
//
    override fun initViewModel() {
//        viewModel.text.observe(viewLifecycleOwner) {
//            binding.textHome.text = it
//        }
    }

    override fun initUI() {
        binding.appBar.btnSearch.setOnClickListener { startSearchActivity() }
    }
//
//    override fun onResume() {
//        super.onResume()
//        enable()
//    }

    private fun startSearchActivity() {
        disable()
        (activity as? MainActivity)?.startSearchActivity()
    }
}