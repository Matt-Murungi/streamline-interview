package com.example.myapplication.network

import retrofit2.http.GET
import javax.inject.Singleton

const val BASE_URL = "http://universities.hipolabs.com/search?country=Uganda"
@Singleton
interface StreamlineAPI{
    @GET("search?country=Uganda")
    suspend fun getUgandanUniversities():List<Any>
}