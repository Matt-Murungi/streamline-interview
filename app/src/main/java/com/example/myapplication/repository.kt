package com.example.myapplication


import android.util.Log
import com.example.myapplication.models.UniversityModel
import com.example.myapplication.models.UniversityModelItem
import com.example.myapplication.network.StreamlineAPI
import com.example.myapplication.utils.DataOrException
import javax.inject.Inject

class AppRepository @Inject constructor(private val api: StreamlineAPI) {
    suspend fun getUgandanUniversities(): DataOrException<UniversityModel, Exception> {
        val dataOrException = DataOrException<UniversityModel, Exception>()
        try {
            val result = api.getUgandanUniversities()
            if (result.isSuccessful) {
                dataOrException.data = result.body()
                Log.d("getUgandanUniversities", "${result.body()}: ")
            }
        } catch (exception: Exception) {
            Log.e("getUgandanUniversities", "${exception}: ")

            dataOrException.e = exception
        }
        return dataOrException
    }
}