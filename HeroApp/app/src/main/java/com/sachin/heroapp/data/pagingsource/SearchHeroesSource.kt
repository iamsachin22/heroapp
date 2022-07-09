package com.sachin.heroapp.data.pagingsource

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.sachin.heroapp.data.remote.HeroApi
import com.sachin.heroapp.domain.model.Hero
import java.lang.Exception
import javax.inject.Inject

class SearchHeroesSource(
    private val heroApi: HeroApi,
    private val query: String
) : PagingSource<Int, Hero>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Hero> {
        return try {
            val apiResponse = heroApi.searchHeroes(name = query)
            val heroes = apiResponse.heroes
            if (heroes.isNotEmpty()) {
                LoadResult.Page(
                    data = heroes,
                    prevKey = apiResponse.prevPage,
                    nextKey = apiResponse.nextPage
                )
            } else {
                LoadResult.Page(
                    data = emptyList(),
                    prevKey = null,
                    nextKey = null
                )
            }
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, Hero>): Int? {
        return state.anchorPosition
    }
}