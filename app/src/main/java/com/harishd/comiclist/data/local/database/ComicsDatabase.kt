package com.harishd.comiclist.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.harishd.comiclist.feature.comicList.module.data.ComicItem

@Database(entities = [ComicItem::class], version = 1)
abstract class ComicsDatabase : RoomDatabase() {

    abstract fun getComicsDao(): ComicsDao

    companion object {
        const val DATABASE_NAME = "comic_database.db"
    }
}