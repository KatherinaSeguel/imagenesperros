package com.example.imagenesperros.model

import retrofit2.http.GET
import retrofit2.http.Path

//interface que tiene los métodos para conectarnos
interface ApiInterface {

    @GET("breeds/list")
    fun getDataFromApi() : retrofit2.Call<List<DataPerros>>

    @GET ("breed/{razas}/images")
    fun getDataFromApiCorutines(@Path("razas") mRazas:String): retrofit2.Response<List<DataPerros>>

}