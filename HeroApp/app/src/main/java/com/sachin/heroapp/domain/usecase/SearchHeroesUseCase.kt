package com.sachin.heroapp.domain.usecase

import androidx.paging.PagingData
import com.sachin.heroapp.data.repository.Repository
import com.sachin.heroapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

class SearchHeroesUseCase(
    private val repository: Repository
) {
    operator fun invoke(query: String): Flow<PagingData<Hero>> {
        return repository.searchHeroes(query = query)
    }
}