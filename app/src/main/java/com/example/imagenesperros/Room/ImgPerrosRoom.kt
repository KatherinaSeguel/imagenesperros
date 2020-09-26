package com.example.imagenesperros.Room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "img_table")
data class ImgPerrosRoom (@PrimaryKey val url: String)
