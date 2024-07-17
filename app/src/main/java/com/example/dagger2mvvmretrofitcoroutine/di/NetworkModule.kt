package com.example.dagger2mvvmretrofitcoroutine.di

import com.example.dagger2mvvmretrofitcoroutine.retrofit.FakerAPI
import com.example.dagger2mvvmretrofitcoroutine.utils.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun providesRetorfit():Retrofit{
        return  Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun providedsFakerAPI(retrofit: Retrofit):FakerAPI{
        return retrofit.create(FakerAPI::class.java)
    }
}