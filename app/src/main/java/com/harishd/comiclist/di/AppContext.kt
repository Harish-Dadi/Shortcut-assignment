package com.harishd.comiclist.di

import com.harishd.comiclist.common.IApplicationContext
import org.koin.java.KoinJavaComponent

object AppContext {
    val applicationContext by KoinJavaComponent.getKoin().inject<IApplicationContext>()
}