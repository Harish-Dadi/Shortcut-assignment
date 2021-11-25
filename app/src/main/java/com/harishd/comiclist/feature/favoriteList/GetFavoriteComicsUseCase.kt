package com.harishd.comiclist.feature.favoriteList

import com.harishd.comiclist.common.BaseUseCase
import com.harishd.comiclist.common.data.AppResult
import com.harishd.comiclist.feature.comicList.module.data.ComicItem
import com.harishd.comiclist.feature.comicList.module.data.IComicRepository

class GetFavoriteComicsUseCase(repository: IComicRepository) : BaseUseCase<IComicRepository>(repository) {
    suspend operator fun invoke(pageNumber: Int, limit: Int): AppResult<List<ComicItem>> {
        return repository.getFavoriteComics(pageNumber, limit)
    }
}