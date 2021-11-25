package com.harishd.comiclist.feature.favoriteList

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.harishd.comiclist.R
import com.harishd.comiclist.common.BaseFragment
import com.harishd.comiclist.common.PagedScrollListener
import com.harishd.comiclist.databinding.FragmentFavoriteComicListBinding
import com.harishd.comiclist.feature.comicList.screens.ComicsAdapter
import kotlinx.android.synthetic.main.fragment_favorite_comic_list.*

class FavoriteListFragment : BaseFragment<FavoriteViewModel>() {

    private var binding: FragmentFavoriteComicListBinding? = null
    private val comicsAdapter = ComicsAdapter {
        if (isDestinationFound(R.id.favoriteListFragment)) {
            findNavController().navigate(
                FavoriteListFragmentDirections.actionFavoriteListFragmentToComicDetailsFragment(it)
            )
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentFavoriteComicListBinding.inflate(inflater, container, false).also { binding = it }.root

    @SuppressLint("NotifyDataSetChanged")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupComicRecyclerView()
        viewModel.getNextFavoriteComics(forceUpdate = true)
        viewModel.comicList.observe(viewLifecycleOwner) {
            comicsAdapter.submitList(it)
            comicsAdapter.notifyDataSetChanged()
        }
    }

    private fun setupComicRecyclerView() {
        comicRecyclerView.setHasFixedSize(true)
        comicRecyclerView?.addOnScrollListener(object : PagedScrollListener(visibleThreshold = SPAN_COUNT) {
            override fun onLoadMore() {
                viewModel.getNextFavoriteComics()
            }
        })
        comicRecyclerView.adapter = comicsAdapter
    }

    override val loadingView: View?
        get() = null

    companion object {
        private const val SPAN_COUNT = 2
    }
}