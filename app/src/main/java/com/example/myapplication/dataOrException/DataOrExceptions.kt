package com.example.myapplication.dataOrException


class DataOrException<T, E : Exception>(
    var data: T? = null,
    var e: E? = null
)