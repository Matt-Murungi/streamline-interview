package com.example.myapplication.utils

import retrofit2.Response


 class DataOrException<T, E : Exception>(
    var data: T? = null,
    var e: E? = null
)