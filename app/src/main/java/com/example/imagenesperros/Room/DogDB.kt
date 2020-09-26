package com.example.imagenesperros.Room

import android.content.Context
import androidx.room.Database
import androidx.room.Entity
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.imagenesperros.model.DataPerros

private const val DATA_BESE_NAME= "dog_db"
@Database(entities=[DogPerrosRoom::class,ImgPerrosRoom::class], version=1 )

abstract class DogDB : RoomDatabase(){

    //Método para DogDao
    abstract fun getDogDao(): DogDao
//Método para ImgDao
    abstract fun getImgDao(): ImgDao

    companion object{  //permite acceder a el sin necesidad de crear el objeto de la clase, nombre clase + punto y acceso a lo que está en el companen objet
        @Volatile
        private var INSTANCE:DogDB?= null
        fun getDataBase(context: Context): DogDB{

            val tempInstance= INSTANCE
            if(tempInstance!= null){
                return tempInstance
            }
            synchronized(this){
                val instance= Room.databaseBuilder(context,
                DogDB::class.java,
                    DATA_BESE_NAME)
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }


}