package htlong.learn.youtube.ui.activities.main

import androidx.activity.viewModels
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import htlong.learn.youtube.R
import htlong.learn.youtube.databinding.ActivityMainBinding
import htlong.learn.youtube.ui.base.BaseActivity
import htlong.learn.youtube.ui.base.BaseFragment

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {

    override val viewModel: MainViewModel by viewModels {
        MainViewModel.Factory()
    }

    private val navHostFragment by lazy { supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_main) as NavHostFragment }

    override fun initViewModel() {}

    override fun initUI() {
        initBottomNav()
    }

    private fun initBottomNav() {
        binding.navView.setupWithNavController(navHostFragment.findNavController())
    }

    override fun onBackPressed() {
        var isSuccess = false
        try {
            isSuccess =
                (navHostFragment.childFragmentManager.fragments[0] as BaseFragment<*>).onBackPressed()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        if (!isSuccess) super.onBackPressed()
    }
}