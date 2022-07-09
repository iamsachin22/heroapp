package com.sachin.heroapp.di

import android.content.Context
import androidx.room.Room
import com.sachin.heroapp.data.HeroDatabase
import com.sachin.heroapp.data.repository.LocalDataSourceImpl
import com.sachin.heroapp.domain.repository.LocalDataSource
import com.sachin.heroapp.util.Constants.HERO_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): HeroDatabase {
        return Room.databaseBuilder(
            context,
            HeroDatabase::class.java,
            HERO_DATABASE
        ).build()
    }

    @Provides
    @Singleton
    fun provideLocalDataSource(
        database: HeroDatabase
    ): LocalDataSource {
        return LocalDataSourceImpl(
            borutoDatabase = database
        )
    }
}