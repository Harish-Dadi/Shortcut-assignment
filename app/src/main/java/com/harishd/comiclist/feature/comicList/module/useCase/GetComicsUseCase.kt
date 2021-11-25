package com.harishd.comiclist.feature.comicList.module.useCase

import com.harishd.comiclist.common.BaseUseCase
import com.harishd.comiclist.common.data.AppResult
import com.harishd.comiclist.feature.comicList.module.data.ComicItem
import com.harishd.comiclist.feature.comicList.module.data.IComicRepository

class GetComicsUseCase(repository: IComicRepository) : BaseUseCase<IComicRepository>(repository) {
    suspend operator fun invoke(pageNumber: Int, limit: Int, lastItemId: Int?): AppResult<List<ComicItem>> {
        return repository.getComics(pageNumber, limit, lastItemId)
    }
}