package htlong.learn.youtube.ui.fragment.histories

import android.widget.TextView
import androidx.fragment.app.viewModels
import htlong.learn.youtube.databinding.FragmentHistoriesBinding
import htlong.learn.youtube.ui.base.BaseFragment

class HistoriesFragment : BaseFragment<FragmentHistoriesBinding>(
    FragmentHistoriesBinding::inflate
) {

    override val viewModel: HistoriesViewModel by viewModels {
        HistoriesViewModel.Factory()
    }
    
    override fun initUI() {
    }

    override fun initViewModel() {
        val textView: TextView = binding.textHistories
        viewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
    }
}