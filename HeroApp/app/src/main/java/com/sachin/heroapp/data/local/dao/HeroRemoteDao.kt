package com.sachin.heroapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.sachin.heroapp.domain.model.HeroRemote

@Dao
interface HeroRemoteDao {
    @Query("SELECT * FROM hero_remote_table WHERE id = :id")
    suspend fun getRemoteData(id: Int): HeroRemote?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAllRemoteData(heroRemoteKeys: List<HeroRemote>)

    @Query("DELETE FROM hero_remote_table")
    suspend fun deleteAllRemoteData()
}
