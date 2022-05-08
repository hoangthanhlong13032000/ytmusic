package htlong.learn.youtube.ui.fragment.trending

import androidx.fragment.app.viewModels
import com.google.android.material.tabs.TabLayout
import htlong.learn.domain.entities.VideoQuery
import htlong.learn.domain.enums.TrendingType
import htlong.learn.youtube.R
import htlong.learn.youtube.common.Extensions.showToast
import htlong.learn.youtube.databinding.FragmentTrendingBinding
import htlong.learn.youtube.ui.base.BaseFragment
import htlong.learn.youtube.ui.recycleview.suggestvideo.SuggestVideoAdapter

class TrendingFragment : BaseFragment<FragmentTrendingBinding>(
    FragmentTrendingBinding::inflate,
) {

    override val viewModel: TrendingViewModel by viewModels {
        TrendingViewModel.Factory(
            getTrendingUseCase = app.getTrendingUseCase
        )
    }

    override fun initViewModel() {
        binding.lifecycleOwner = viewLifecycleOwner
        binding.vm = viewModel
    }

    override fun initUI() {
        initRecSuggestUI()
        initTabLayout()
        initSwipeRefresh()
    }

    private fun initRecSuggestUI() {
        binding.run {
            sgVideoRecSuggest.adapter = SuggestVideoAdapter(
                videoQuery = VideoQuery()
            ) { vDetails ->
                requireActivity().showToast(vDetails.title)
            }
        }
        viewModel.getTrending {}
    }

    private fun initTabLayout() {
        binding.tlTrendingTab.run {
            // note: get tab before add listener (useful for case rotate screen)
            getTabAt(viewModel.trendingType.ordinal)?.select()

            addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
                override fun onTabSelected(tab: TabLayout.Tab?) {
                    val pos = tab?.position
                    if (pos != null && pos != TabLayout.Tab.INVALID_POSITION) {
                        val type = when (pos) {
                            TrendingType.NOW.ordinal -> TrendingType.NOW
                            TrendingType.MUSIC.ordinal -> TrendingType.MUSIC
                            TrendingType.GAMING.ordinal -> TrendingType.GAMING
                            TrendingType.SPORT.ordinal -> TrendingType.SPORT
                            else -> null
                        }
                        viewModel.getTrending(type) {
                            binding.sgVideoRecSuggest.scrollToPosition(0)
                        }
                    }
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {}
                override fun onTabReselected(tab: TabLayout.Tab?) {
                    binding.sgVideoRecSuggest.smoothScrollToPosition(0)
                }
            })
        }
    }

    private fun initSwipeRefresh() {
        binding.loSwipeRefresh.run {
            setColorSchemeColors(context.getColor(R.color.red_500))
            setOnRefreshListener {
                isRefreshing = true
                viewModel.getTrending { isRefreshing = false }
            }
        }
    }

    override fun onBackPressed(): Boolean {
        binding.sgVideoRecSuggest.smoothScrollToPosition(0)
        return true
    }
}