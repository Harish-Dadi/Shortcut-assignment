package com.harishd.comiclist.feature.search

import com.harishd.comiclist.common.BaseUseCase
import com.harishd.comiclist.common.data.AppResult
import com.harishd.comiclist.feature.comicList.module.data.ComicItem
import com.harishd.comiclist.feature.comicList.module.data.IComicRepository

class SearchUseCase(repository: IComicRepository) : BaseUseCase<IComicRepository>(repository) {
    suspend operator fun invoke(pageNumber: Int, limit: Int, query: String): AppResult<List<ComicItem>> {
        return repository.search(pageNumber, limit, query)
    }
}