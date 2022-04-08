package com.example.retrofitnetworkcall

import android.telecom.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Query

//https://newsapi.org/v2/top-headlines?country=in&apiKey=faff3e7800ed45f194da35428667feb9

const val BASE_URL="https://newsapi.org"

//API calling
interface NewsInterFace
{
    @GET("https://newsapi.org/v2/top-headlines?country=in&apiKey=faff3e7800ed45f194da35428667feb9")
    fun getheadLine():retrofit2.Call<News>
}
//we create singleton class and object creation

object NewsService
{
    val newsInstance:NewsInterFace
    init {
        val retrofit=Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            

    newsInstance=retrofit.create(NewsInterFace::class.java)
    }
}
