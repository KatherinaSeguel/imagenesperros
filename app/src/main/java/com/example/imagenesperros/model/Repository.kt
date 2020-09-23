package com.example.imagenesperros.model

import android.util.Log
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {
    private val service= RetrofitClient.getRetrofitClient()
    val mLiveData : MutableLiveData<DataPerros> = MutableLiveData()  //lista que se puede modificar métodos:replace up
    // es val porque la posisión de memoria no se modifica , pero SI el contenido

    //La vieja confiable
    fun getDataFromServer(){
        val call = service.getDataFromApi()
        call.enqueue(object : Callback<DataPerros> {

            override fun onResponse(
                call: Call<DataPerros>,
                response: Response<DataPerros>
            ) {
                when(response.code()){
                    in 200..299 -> mLiveData.postValue(response.body())
                    in 300..399 -> Log.d("ERROR 300",response.errorBody().toString())

                }
            }

            override fun onFailure(call: Call<DataPerros>, t: Throwable) {  //maneja falla, si el servidor no responde
                Log.e("Repository",t.message.toString())
            }

        })  //llamadas asincronas

    }

}