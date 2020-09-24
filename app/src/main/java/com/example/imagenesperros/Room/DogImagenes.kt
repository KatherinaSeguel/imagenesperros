package com.example.imagenesperros.Room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "imagenes_tabla")
data class DogImagenes (@PrimaryKey val urlImagen:String)