package com.harishd.comiclist.utils

import android.content.Context
import android.content.Intent
import com.harishd.comiclist.R

object ShareUtils {

    fun shareTextUrl(context: Context, url: String) {
        val share = Intent(Intent.ACTION_SEND);
        share.type = "text/plain";
        share.putExtra(Intent.EXTRA_TEXT, url);
        context.startActivity(Intent.createChooser(share, context.getString(R.string.share_link)))
    }
}