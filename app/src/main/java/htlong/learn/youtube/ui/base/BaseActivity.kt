package htlong.learn.youtube.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import htlong.learn.youtube.YoutubeApplication

abstract class BaseActivity<VB : ViewBinding>(
    private val bindingInflater: (inflater: LayoutInflater) -> VB
) : AppCompatActivity() {

    protected val app by lazy { application as YoutubeApplication }
    protected val binding by lazy { bindingInflater(layoutInflater) }

    private var isNotYetInit: Boolean = true

    abstract val viewModel: ViewModel
    abstract fun initUI()
    abstract fun initViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        if (isNotYetInit) {
            initViewModel()
            initUI()
            isNotYetInit = false
        }
    }
}