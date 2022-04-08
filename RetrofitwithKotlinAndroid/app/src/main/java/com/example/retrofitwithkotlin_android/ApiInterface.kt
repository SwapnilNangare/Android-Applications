package com.example.retrofitwithkotlin_android

import retrofit2.Call
import retrofit2.http.GET



//Define End Points : Now we create an interface ApiInterface.kt under retrofit package to define the api end points

interface ApiInterface {

    @GET("photos")
    fun getPhotos():Call<List<DataModel>>
}