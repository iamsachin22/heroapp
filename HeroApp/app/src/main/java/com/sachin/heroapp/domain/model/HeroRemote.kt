package com.sachin.heroapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.sachin.heroapp.util.Constants.HERO_REMOTE_DATABASE_TABLE

@Entity(tableName = HERO_REMOTE_DATABASE_TABLE)
data class HeroRemote(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val prevPage: Int?,
    val nextPage: Int?,
    val lastUpdated: Long?
)
