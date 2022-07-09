package com.sachin.heroapp.domain.usecase

import com.sachin.heroapp.data.repository.Repository
import com.sachin.heroapp.domain.model.Hero


class GetSelectedHeroUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(heroId: Int): Hero {
        return repository.getSelectedHero(heroId = heroId)
    }
}