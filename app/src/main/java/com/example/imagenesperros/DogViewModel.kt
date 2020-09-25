package com.example.imagenesperros

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.imagenesperros.Room.DogDB
import com.example.imagenesperros.Room.DogDao
import com.example.imagenesperros.Room.DogPerrosRoom
import com.example.imagenesperros.model.Repository

class DogViewModel(application: Application) : AndroidViewModel(application) {     //sólo se hereda de la clase ViewModel sin contexto porque no es ROOM(androidViewmodel)
//Linea de arriba se modifica cuando después creo el ROOM

    private val mRepository: Repository
    //variable referencial al repositorio
            init{
        //se instancia el repositorio
        val dogDao = DogDB.getDataBase(application).getDogDao()
        mRepository= Repository(dogDao)
               //indico el método que traerá el repository
                mRepository.getDataFromServer()
                }

    fun exposeLiveDataFromServer(): LiveData<List<DogPerrosRoom>> {
        return mRepository.mLiveData
    }


}