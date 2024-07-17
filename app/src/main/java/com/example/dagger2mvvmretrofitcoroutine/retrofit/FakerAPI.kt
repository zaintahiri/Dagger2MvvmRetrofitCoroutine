package com.example.dagger2mvvmretrofitcoroutine.retrofit

import com.example.dagger2mvvmretrofitcoroutine.models.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {
    @GET("products")
    suspend fun getProducts():Response<List<Product>>
}