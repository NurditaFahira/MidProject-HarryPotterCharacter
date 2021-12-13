package com.example.midprojectharrypotternurditafahira.Network

import com.example.midprojectharrypotternurditafahira.DataKarakter
import retrofit2.Call
import retrofit2.http.GET

interface api {
    @GET("api/characters")
    fun getDataKarakter() : Call<DataKarakter>

}