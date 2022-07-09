package com.sachin.heroapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.sachin.heroapp.DatabaseConverter
import com.sachin.heroapp.data.local.dao.HeroDao
import com.sachin.heroapp.data.local.dao.HeroRemoteDao
import com.sachin.heroapp.domain.model.Hero
import com.sachin.heroapp.domain.model.HeroRemote

@Database(entities = [Hero::class,HeroRemote::class], version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class HeroDatabase: RoomDatabase() {

    abstract fun heroDao(): HeroDao

    abstract fun heroRemoteDao(): HeroRemoteDao
}