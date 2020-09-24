package com.example.imagenesperros.Room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "dog_table")
data class DogPerrosRoom (@PrimaryKey val dog: String)