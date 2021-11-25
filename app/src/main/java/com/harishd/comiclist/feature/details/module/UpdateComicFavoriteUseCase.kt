package com.harishd.comiclist.feature.details.module

import com.harishd.comiclist.common.BaseUseCase
import com.harishd.comiclist.common.data.AppResult
import com.harishd.comiclist.feature.comicList.module.data.IComicRepository

class UpdateComicFavoriteUseCase(repository: IComicRepository) : BaseUseCase<IComicRepository>(repository) {
    suspend operator fun invoke(comicNumber: Int, isFavorite: Boolean): AppResult<Boolean> {
        return repository.updateComicFavorite(comicNumber, isFavorite)
    }
}