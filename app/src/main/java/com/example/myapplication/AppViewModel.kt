package com.example.myapplication

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AppViewModel @Inject constructor(private val repository: AppRepository):ViewModel(){

    init {
        fetchUgandanUniversities()
    }

    fun fetchUgandanUniversities(){
    viewModelScope.launch {
        val result = repository.getUgandanUniversities()
        Log.d("Viewmodel ", "$result")
    }
    }
}