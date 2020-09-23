package com.example.imagenesperros

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.imagenesperros.model.DataPerros
import com.example.imagenesperros.model.Repository

class DogViewModel : ViewModel() {     //sólo se hereda de la clase ViewModel sin contexto porque no es ROOM(androidViewmodel)

    private val mRepository= Repository()
           //variable referencial al repositorio
            init{

               //indico el método que traerá el repository
                mRepository.getDataFromServer()
                }

    fun exposeLiveDataFromServer(): LiveData<DataPerros>{
        return mRepository.mLiveData
    }


}