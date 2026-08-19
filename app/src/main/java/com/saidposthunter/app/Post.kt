package com.saidposthunter.app

data class Post(
    val id: String,
    val content: String,
    val groupName: String?,
    val authorName: String?,
    val createdAt: String?,
    val url: String?
)
