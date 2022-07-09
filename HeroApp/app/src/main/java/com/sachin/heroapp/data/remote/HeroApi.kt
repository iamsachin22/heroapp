package com.sachin.heroapp.data.remote

import com.sachin.heroapp.domain.model.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface HeroApi {

    @GET("/indian/heroes")
    suspend fun getAllHeroes(
        @Query("page") page: Int = 1
    ): ApiResponse

    @GET("/indian/heroes/search")
    suspend fun searchHeroes(
        @Query("name") name: String
    ): ApiResponse

}