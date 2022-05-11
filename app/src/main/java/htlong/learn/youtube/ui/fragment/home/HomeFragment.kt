package htlong.learn.youtube.ui.fragment.home

import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.viewModels
import htlong.learn.youtube.common.Extensions.showToast
import htlong.learn.youtube.databinding.FragmentHomeBinding
import htlong.learn.youtube.ui.activities.search.SearchActivity
import htlong.learn.youtube.ui.base.BaseFragment

class HomeFragment() : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    private var isDisable = false

    override val viewModel: HomeViewModel by viewModels {
        HomeViewModel.Factory()
    }

    private val startActivityForResult =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            it.data?.getStringExtra(SearchActivity.KEY_SEARCH)?.let { video ->
                context?.showToast(video)
            }
        }


    override fun initViewModel() {
        viewModel.text.observe(viewLifecycleOwner) {
            binding.textHome.text = it
        }
    }

    override fun initUI() {
        binding.appBar.btnSearch.setOnClickListener { startSearchActivity() }
    }

    override fun onResume() {
        super.onResume()
        isDisable = false
    }

    private fun startSearchActivity() {
        if (!isDisable) {
            isDisable = true
            context?.let { startActivityForResult.launch(SearchActivity.getIntent(it)) }
//            context?.let {
//                startActivity(SearchActivity.getIntent(it))
//            }
        }
    }
}