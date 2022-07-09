package com.sachin.heroapp.domain.repository

import com.sachin.heroapp.domain.model.Hero

interface LocalDataSource {
    suspend fun getSelectedHero(heroId: Int): Hero
}