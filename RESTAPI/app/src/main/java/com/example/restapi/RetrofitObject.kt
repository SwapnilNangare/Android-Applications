package com.example.restapi

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitObject {

    object RetrofitClient {
        val BASE_URL = "http://staging.php-dev.in:8844/trainingapp/api/"

        val getClient: API
            get() {
                val gson = GsonBuilder()
                    .setLenient()
                    .create()

                val retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()

                return retrofit.create(API::class.java)
            }
    }
}
