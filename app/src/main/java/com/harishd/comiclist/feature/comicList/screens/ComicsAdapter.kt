package com.harishd.comiclist.feature.comicList.screens

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import com.harishd.comiclist.R
import com.harishd.comiclist.common.BaseAdapter
import com.harishd.comiclist.feature.comicList.module.view.ComicItemView

class ComicsAdapter(private val onItemClicked: (ComicItemView) -> Unit) :
    BaseAdapter<ComicItemView, ComicItemViewHolder>(diffCallback) {

    override fun getViewHolder(parent: ViewGroup, viewType: Int) = ComicItemViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.list_item_comic, parent, false), onItemClicked
    )

    companion object {
        val diffCallback = object : DiffUtil.ItemCallback<ComicItemView>() {
            override fun areItemsTheSame(
                oldItem: ComicItemView,
                newItem: ComicItemView
            ): Boolean = oldItem.number == newItem.number

            override fun areContentsTheSame(
                oldItem: ComicItemView,
                newItem: ComicItemView
            ): Boolean = oldItem == newItem
        }
    }
}