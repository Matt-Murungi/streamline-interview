package com.example.myapplication

import android.util.Log
import com.example.myapplication.network.StreamlineAPI
import javax.inject.Inject

class AppRepository @Inject constructor(private val api: StreamlineAPI){
    suspend fun getUgandanUniversities() {
        try {
            val result:List<Any> = api.getUgandanUniversities()
            Log.d("Result repository", "${result}")
        }catch (exception: Exception){
            Log.d("Error repository", "${exception}")
        }
    }
}