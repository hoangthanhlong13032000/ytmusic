package htlong.learn.youtube.ui.fragment.trending

import android.widget.TextView
import htlong.learn.youtube.databinding.FragmentTrendingBinding
import htlong.learn.youtube.ui.base.BaseFragment

class TrendingFragment : BaseFragment<FragmentTrendingBinding, TrendingViewModel>(
    FragmentTrendingBinding::inflate,
    TrendingViewModel::class.java
) {
    override fun initUI() {
    }

    override fun initViewModel() {
        val textView: TextView = binding.textTrending
        viewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
    }
}