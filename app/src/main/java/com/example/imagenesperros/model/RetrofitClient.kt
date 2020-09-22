package com.example.imagenesperros.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    companion object{

        private const val  URL_BASE = "https://dog.ceo/api/"


        fun getRetrofitClient(): ApiInterface {

         val mRetrofit = Retrofit.Builder()
             .baseUrl(URL_BASE)
             .addConverterFactory(GsonConverterFactory.create())
             .build()
            return  mRetrofit.create(ApiInterface::class.java) // devuelve la unión de la Interface con el cliente retrofit

        }
    }
}