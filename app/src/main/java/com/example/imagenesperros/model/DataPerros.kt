package com.example.imagenesperros.model


import com.google.gson.annotations.SerializedName

data class DataPerros(
    @SerializedName("message") val message: List<String>,
    @SerializedName("status")  val status: String
)