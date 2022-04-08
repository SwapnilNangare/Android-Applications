package com.example.restapidemo

import com.example.restapidemo.Model.PostModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface
{

    @GET("posts")
    fun fetchAllPosts():Call<List<PostModel>>



}