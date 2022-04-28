package htlong.learn.youtube.ui.activities.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import htlong.learn.youtube.R
import htlong.learn.youtube.databinding.ActivityMainBinding
import htlong.learn.youtube.ui.activities.search.SearchActivity
import htlong.learn.youtube.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    private var isDisable = false

    override fun initUI() {
        initBottomNav()
        binding.appBar.btnSearch.setOnClickListener { startSearchActivity() }
    }

    override fun onResume() {
        super.onResume()
        isDisable = false
    }

    private fun initBottomNav() {
        binding.navView.setupWithNavController(
            findNavController(R.id.nav_host_fragment_activity_main)
        )
    }

    private fun startSearchActivity() {
        if (!isDisable) {
            isDisable = true
            startActivity(SearchActivity.getIntent(baseContext))
        }
    }

    companion object {
        fun getIntent(context: Context) = Intent(context, MainActivity::class.java)
    }
}