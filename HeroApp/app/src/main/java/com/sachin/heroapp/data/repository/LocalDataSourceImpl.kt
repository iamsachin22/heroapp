package com.sachin.heroapp.data.repository

import com.sachin.heroapp.data.HeroDatabase
import com.sachin.heroapp.domain.model.Hero
import com.sachin.heroapp.domain.repository.LocalDataSource


class LocalDataSourceImpl(borutoDatabase: HeroDatabase): LocalDataSource {

    private val heroDao = borutoDatabase.heroDao()

    override suspend fun getSelectedHero(heroId: Int): Hero {
        return heroDao.getSelectedHero(heroId = heroId)
    }
}