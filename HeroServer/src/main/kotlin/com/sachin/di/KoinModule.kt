package com.sachin.di

import com.sachin.repository.HeroRepository
import com.sachin.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
   single<HeroRepository> {
       HeroRepositoryImpl()
   }
}