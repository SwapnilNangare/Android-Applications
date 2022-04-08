package com.example.restapi

import android.widget.EditText
import retrofit2.Call
import retrofit2.http.*

interface API
{

    @FormUrlEncoded
    @POST(value = "api/users/login")
    fun userLogin(
        @Field(value = "email") email: String,
        @Field(value = "password") password: EditText,
    ): Call<DataClass>

    //Register APi

    @FormUrlEncoded
    @POST(value = "api/users/register")
    fun userRegister(
        @Field(value = "first_name") first_name: String,
        @Field(value = "last_name") last_name: String,
        @Field(value = "email") email: String,
        @Field(value = "password") password: String,
        @Field(value = "confirm_password") confirm_password: String,
        @Field(value = "gender") gender: String,
        @Field(value = "phone_no") phone_no: Long,
    ): Call<DataClass>


}
