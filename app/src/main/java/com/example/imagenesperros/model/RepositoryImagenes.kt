package com.example.imagenesperros.model

import android.util.Log
import com.example.imagenesperros.Room.DogPerrosRoom
import com.example.imagenesperros.Room.ImgDao
import com.example.imagenesperros.Room.ImgPerrosRoom
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

//class RepositoryImagenes(private val imgDao: ImgDao) {

//    private val service= RetrofitClient.getRetrofitClient()
//    // ****se cambia***val mLiveData : MutableLiveData<DataPerros> = MutableLiveData()  //lista que se puede modificar métodos:replace up
//    // es val porque la posisión de memoria no se modifica , pero SI el contenido
//
//
//    val mLiveimg=imgDao.getAllImgFromDB()
////luego lo de las imagenes va aquí
//    //La vieja confiable
//    fun getImgFromServer(){
//        val call = service.getDataFromApiCorutines()
//        call.enqueue(object : Callback<DogImagenes> {
//
//            override fun onResponse(
//                call: Call<DogImagenes>,
//                response: Response<DogImagenes>
//            ) {
//                when(response.code()){
//                    //***se cambia***  in 200..299 -> mLiveData.postValue(response.body())
//                    in 200..299 -> CoroutineScope(Dispatchers.IO).launch {
//                        response.body()?.let {
//                            imgDao.insertAllImg(converter(it.urlImagen))
//                            //imgDao.insertAllDog(converter(it.message))
//                        }
//                    }
//                    in 300..399 -> Log.d("ERROR 300",response.errorBody().toString())
//
//                }
//            }
//
//            override fun onFailure(call: Call<DogImagenes>, t: Throwable) {
//                //Log.d("mensaje",t)
//            }
//
//        }
//
//        })  //llamadas asincronas

   // }



/*
fun converter(list: String):List<ImgPerrosRoom>{

        var listadoDeImg:MutableList<ImgPerrosRoom> = mutableListOf<ImgPerrosRoom>()
        list.map {
            listadoDeImg.add(ImgPerrosRoom(it.toString())
        }
        return listadoDeImg
    }

}*/
