package com.example.imagenesperros.Room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ImgDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllImg(mImgList: List<DogPerrosRoom>)

    @Query("SELECT * FROM img_table")
    fun getAllImgFromDB(): LiveData<List<ImgPerrosRoom>>




}