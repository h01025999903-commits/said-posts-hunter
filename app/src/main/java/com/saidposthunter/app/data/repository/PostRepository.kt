package com.saidposthunter.app.data.repository

import com.saidposthunter.app.data.api.ApiClient
import com.saidposthunter.app.data.api.PostItem
import com.saidposthunter.app.Post

class PostRepository {
    private val apiService = ApiClient.instance
    private val TOKEN = "apify_api_PfAd0Mu4wgfx2j1gzoDEJSq5IpfFQg3sriNm"

    suspend fun searchPosts(query: String): List<Post> {
        return try {
            val response = apiService.searchPosts(TOKEN, query, 20)
            response.data?.items?.map { item ->
                Post(
                    id = item.postUrl ?: "",
                    content = item.text ?: "لا يوجد نص",
                    groupName = item.pageName,
                    authorName = null,
                    createdAt = item.timestamp,
                    url = item.postUrl
                )
            } ?: emptyList()
        } catch (e: Exception) {
            emptyList()
        }
    }
}
