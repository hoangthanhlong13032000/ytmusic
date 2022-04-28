package htlong.learn.youtube.ui.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import htlong.learn.youtube.R
import htlong.learn.youtube.databinding.ActivityMainBinding
import htlong.learn.youtube.ui.base.BaseActivity
import htlong.learn.youtube.ui.search.SearchActivity

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    private var isDisable = false

//    private val startActivity = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
//        if (it.resultCode == Activity.RESULT_OK) {
//            val value = it.data?.getStringExtra(KEY_QUERY) ?: ""
//            showToast(value)
//        }
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initBottomNav()
        initUI()
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

    private fun initUI() {
        this.onPause()
        binding.appBar.btnSearch.setOnClickListener { startSearchActivity() }
    }

    private fun startSearchActivity() {
        if(!isDisable) {
            isDisable = true
//            startActivity.launch(SearchActivity.getIntent(baseContext))
            startActivity(SearchActivity.getIntent(baseContext))
        }
    }

    companion object {
        const val KEY_QUERY = "KEY_QUERY"
        fun getIntent(context: Context) = Intent(context, MainActivity::class.java)
    }
}