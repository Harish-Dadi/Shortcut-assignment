package com.harishd.comiclist.feature.comicList.module.data

import com.harishd.comiclist.common.data.AppResult
import com.harishd.comiclist.common.data.IBaseRepository

interface IComicRepository : IBaseRepository {
    suspend fun getComics(pageNumber: Int, limit: Int, lastItemId: Int?): AppResult<List<ComicItem>>
    suspend fun updateComicFavorite(comicNumber: Int, isFavorite: Boolean): AppResult<Boolean>
    suspend fun getFavoriteComics(pageNumber: Int, limit: Int): AppResult<List<ComicItem>>
    suspend fun search(pageNumber: Int, limit: Int, query: String): AppResult<List<ComicItem>>
}