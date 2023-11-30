package com.example.myapplication.di
import com.example.myapplication.AppRepository
import com.example.myapplication.network.StreamlineAPI
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Singleton
    @Provides
    fun provideAPI(): StreamlineAPI {
        val clientProvider: OkHttpClient = provideOkHttpClient()
        val gson = GsonBuilder().setLenient().create()

        val retrofit = Retrofit.Builder()
            .baseUrl("http://universities.hipolabs.com/") // Use the constant BASE_URL here
            .client(clientProvider)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()

        return retrofit.create(StreamlineAPI::class.java)
    }
    @Singleton
    @Provides
    fun provideGson(): Gson {
        return GsonBuilder().create()
    }




    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            // Add any OkHttpClient configurations if needed
            .build()
    }

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient, gson: Gson): Retrofit {
        return Retrofit.Builder()
            .baseUrl("YOUR_BASE_URL")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(okHttpClient)
            .build()
    }

    // Optionally, you can provide your Retrofit service interface here as well
    // For example:
    // @Singleton
    // @Provides
    // fun provideYourApiService(retrofit: Retrofit): YourApiService {
    //     return retrofit.create(YourApiService::class.java)
    // }
}
