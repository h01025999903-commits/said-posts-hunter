package com.saidposthunter.app.data.api

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("v2/actors/apify~facebook-pages-scraper/runs")
    suspend fun searchPosts(
        @Query("token") token: String,
        @Query("searchTerm") query: String,
        @Query("maxPosts") limit: Int = 20
    ): ApiResponse
}
