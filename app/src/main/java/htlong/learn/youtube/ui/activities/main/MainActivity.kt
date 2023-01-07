package htlong.learn.youtube.ui.activities.main

import android.content.Context
import android.content.Intent
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.gson.Gson
import htlong.learn.data.common.Utils
import htlong.learn.domain.entities.AudioDetail
import htlong.learn.youtube.R
import htlong.learn.youtube.common.Extensions.showToast
import htlong.learn.youtube.databinding.ActivityMainBinding
import htlong.learn.youtube.ui.activities.search.SearchActivity
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
        val fragments = navHostFragment.childFragmentManager.fragments
        if (fragments.isNotEmpty()) {
            val fragment = fragments[0]
            if (fragment is BaseFragment<*>) fragment.onBackPressed()
            else super.onBackPressed()
        }
    }

    private val startActivityForResult =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            parseResultFromSearchActivity(it)
        }

    private fun parseResultFromSearchActivity(aResult: ActivityResult) {
        try {
            aResult.data?.getStringExtra(SearchActivity.KEY_SEARCH)?.let { video ->
                val vDetail = Gson().fromJson(video, AudioDetail::class.java)

                showToast(vDetail.title)
            }
        } catch (e: Exception) {
            e.printStackTrace()
            Utils.handleException(MAIN_ACTIVITY, e)
        }
    }

    fun startSearchActivity() {
        startActivityForResult.launch(SearchActivity.getIntent(baseContext))
    }

    companion object {
        const val MAIN_ACTIVITY = "main_activity"
        fun getIntent(context: Context) = Intent(context, SearchActivity::class.java)
    }
}