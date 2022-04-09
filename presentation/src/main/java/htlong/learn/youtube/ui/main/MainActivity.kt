package htlong.learn.youtube.ui.main

import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import htlong.learn.youtube.R
import htlong.learn.youtube.databinding.ActivityMainBinding
import htlong.learn.youtube.ui.base.BaseActivity
import htlong.learn.youtube.ui.search.SearchActivity

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initBottomNav()
        initUI()
    }

    private fun initBottomNav() {
        val navView: BottomNavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        navView.setupWithNavController(navController)
    }

    private fun initUI() {
        binding.appBar.btnSearch.setOnClickListener {
            startActivity(SearchActivity.getIntent(baseContext))
        }
    }
}