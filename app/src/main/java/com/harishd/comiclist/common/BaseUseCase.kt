package com.harishd.comiclist.common

import com.harishd.comiclist.common.data.IBaseRepository

abstract class BaseUseCase<Repository : IBaseRepository>(val repository: Repository)