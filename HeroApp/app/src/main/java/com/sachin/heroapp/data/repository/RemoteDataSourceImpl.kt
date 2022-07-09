package com.sachin.heroapp.data.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.sachin.heroapp.data.HeroDatabase
import com.sachin.heroapp.data.pagingsource.HeroRemoteMediator
import com.sachin.heroapp.data.pagingsource.SearchHeroesSource
import com.sachin.heroapp.data.remote.HeroApi
import com.sachin.heroapp.domain.model.Hero
import com.sachin.heroapp.domain.repository.RemoteDataSource
import com.sachin.heroapp.util.Constants.ITEMS_PER_PAGE
import kotlinx.coroutines.flow.Flow

@ExperimentalPagingApi
class RemoteDataSourceImpl(
    private val heroApi: HeroApi,
    private val heroDatabase: HeroDatabase
) : RemoteDataSource {

    private val heroDao = heroDatabase.heroDao()

    override fun getAllHeroes(): Flow<PagingData<Hero>> {
        val pagingSourceFactory = { heroDao.getAllHeroes() }
        return Pager(
            config = PagingConfig(pageSize = ITEMS_PER_PAGE),
            remoteMediator = HeroRemoteMediator(
                heroApi = heroApi,
                heroDatabase = heroDatabase
            ),
            pagingSourceFactory = pagingSourceFactory
        ).flow
    }

    override fun searchHeroes(query: String): Flow<PagingData<Hero>> {
        return Pager(
            config = PagingConfig(pageSize = ITEMS_PER_PAGE),
            pagingSourceFactory = {
                SearchHeroesSource(heroApi = heroApi, query = query)
            }
        ).flow
    }
}