package htlong.learn.youtube.ui.fragment.playlists

import androidx.fragment.app.viewModels
import htlong.learn.youtube.databinding.FragmentPlaylistsBinding
import htlong.learn.youtube.ui.base.BaseFragment

class PlayListsFragment : BaseFragment<FragmentPlaylistsBinding>(
    FragmentPlaylistsBinding::inflate
) {

    override val viewModel: PlaylistsViewModel by viewModels {
        PlaylistsViewModel.Factory()
    }

    override fun initUI() {}

    override fun initViewModel() {
        viewModel.text.observe(viewLifecycleOwner) {
            binding.textPlaylists.text = it
        }
    }
}