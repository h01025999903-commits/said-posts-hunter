package com.saidposthunter.app.data.api

import com.google.gson.annotations.SerializedName

data class ApiResponse(
    @SerializedName("data")
    val data: Data?
)

data class Data(
    @SerializedName("items")
    val items: List<PostItem>?
)

data class PostItem(
    @SerializedName("text")
    val text: String?,
    
    @SerializedName("pageName")
    val pageName: String?,
    
    @SerializedName("postUrl")
    val postUrl: String?,
    
    @SerializedName("timestamp")
    val timestamp: String?
)
