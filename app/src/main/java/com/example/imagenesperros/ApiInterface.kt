package com.example.imagenesperros

import android.provider.CallLog
import android.telecom.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("breeds/list")
    fun getDataFromApi() : Call<List<>>

}