package com.example.imagenesperros.model

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import retrofit2.http.GET
import retrofit2.http.Path

//interface que tiene los métodos para conectarnos
interface ApiInterface {

    @GET("breeds/list")
    fun getDataFromApi() : retrofit2.Call<DataPerros>

    @GET ("breed/{razas}/images")
    fun getDataFromApiCorutines(@Path("razas") mRazas:String): retrofit2.Response<DataPerros>

}