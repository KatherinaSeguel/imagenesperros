package com.example.imagenesperros


import com.google.gson.annotations.SerializedName

data class DataList(
    @SerializedName("message")
    val message: List<String>,
    @SerializedName("status")
    val status: String
)