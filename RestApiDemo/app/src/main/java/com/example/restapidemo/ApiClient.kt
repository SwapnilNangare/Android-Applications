package com.example.restapidemo

import com.google.gson.GsonBuilder
import okhttp3.OkHttp
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class ApiClient
{


    companion object
    {
        val BASE_URL="https://jsonplaceholder.typicode.com/"

        private var retrofit:Retrofit?=null
        fun getApiClient():Retrofit
        {

            val gson= GsonBuilder()
                .setLenient()
                .create()
            val okHttpClient=OkHttpClient.Builder()
                .readTimeout(1000,TimeUnit.SECONDS)
                .connectTimeout(1000,TimeUnit.SECONDS)
                .build()

            if(retrofit==null)
            {
                retrofit=Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()
            }
            return  retrofit!!
        }


    }
}