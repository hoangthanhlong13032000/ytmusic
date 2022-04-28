package htlong.learn.youtube.ui.fragment.playlists

import htlong.learn.youtube.databinding.FragmentPlaylistsBinding
import htlong.learn.youtube.ui.base.BaseFragment

class PlayListsFragment : BaseFragment<FragmentPlaylistsBinding, PlaylistsViewModel>(
    FragmentPlaylistsBinding::inflate,
    PlaylistsViewModel::class.java
) {

    override fun initUI() {}

    override fun initViewModel() {
        viewModel.text.observe(viewLifecycleOwner) {
            binding.textPlaylists.text = it
        }
    }
}