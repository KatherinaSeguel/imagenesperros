package com.example.imagenesperros.Room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.imagenesperros.model.DataPerros

@Dao
interface DogDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllDog(mDogList:List<DogPerrosRoom>)

    @Query("SELECT * FROM dog_table")
    fun getAllDogFromDB():LiveData<List<DogPerrosRoom>>


}