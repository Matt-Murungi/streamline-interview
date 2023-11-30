package com.example.myapplication.network

import com.example.myapplication.models.UniversityModel
import retrofit2.Response
import retrofit2.http.GET
import javax.inject.Singleton

const val BASE_URL = "http://universities.hipolabs.com/search?country=Uganda"
@Singleton
interface StreamlineAPI{
    @GET("search?country=Uganda")
    suspend fun getUgandanUniversities():Response<UniversityModel>
}