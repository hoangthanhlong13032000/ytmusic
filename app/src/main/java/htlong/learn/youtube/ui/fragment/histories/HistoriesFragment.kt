package htlong.learn.youtube.ui.fragment.histories

import android.widget.TextView
import htlong.learn.youtube.databinding.FragmentHistoriesBinding
import htlong.learn.youtube.ui.base.BaseFragment

class HistoriesFragment : BaseFragment<FragmentHistoriesBinding, HistoriesViewModel>(
    FragmentHistoriesBinding::inflate,
    HistoriesViewModel::class.java
) {
    override fun initUI() {
    }

    override fun initViewModel() {
        val textView: TextView = binding.textHistories
        viewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
    }
}