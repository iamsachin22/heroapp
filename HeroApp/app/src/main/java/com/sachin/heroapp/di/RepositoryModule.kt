package com.sachin.heroapp.di

import android.content.Context
import com.sachin.heroapp.data.repository.DataStoreOperationsImpl
import com.sachin.heroapp.data.repository.Repository
import com.sachin.heroapp.domain.repository.DataStoreOperations
import com.sachin.heroapp.domain.usecase.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideDataStoreOperations(
        @ApplicationContext context: Context
    ): DataStoreOperations {
        return DataStoreOperationsImpl(context = context)
    }

    @Provides
    @Singleton
    fun provideUseCases(repository: Repository): UseCases {
        return UseCases(
            saveOnBoardingUseCase = SaveOnBoardingUseCase(repository),
            readOnBoardingUseCase = ReadOnBoardingUseCase(repository),
            getAllHeroesUseCase = GetAllHeroesUseCase(repository),
           searchHeroesUseCase = SearchHeroesUseCase(repository),
           getSelectedHeroUseCase = GetSelectedHeroUseCase(repository)
        )
    }
}