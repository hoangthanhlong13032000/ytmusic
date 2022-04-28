package htlong.learn.youtube.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding>(
    private val bindingInflater: (inflater: LayoutInflater) -> VB
) : AppCompatActivity() {

    protected val binding by lazy { bindingInflater(layoutInflater) }

    private var isNotYetInit: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        if (isNotYetInit) {
            initUI()
            isNotYetInit = false
        }
    }

    abstract fun initUI()
}