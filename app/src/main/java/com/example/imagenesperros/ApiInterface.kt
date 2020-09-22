package com.example.imagenesperros

import android.telecom.Call
import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Path


interface ApiInterface {

    @GET("breeds/list")
    fun getDataFromApi() :Call<List<DataList>>

    @GET ("breed/{razas}/images")
    fun getDataFromApiCorutines(@Path("razas") mRazas:String): Response<List<DataList>>

}