package com.example.dagger2mvvmretrofitcoroutine.models

import com.google.gson.annotations.SerializedName


data class Product (

    @SerializedName("id"          ) var id          : Int?    = null,
    @SerializedName("title"       ) var title       : String? = null,
    @SerializedName("price"       ) var price       : Double? = null,
    @SerializedName("description" ) var description : String? = null,
    @SerializedName("category"    ) var category    : String? = null,
    @SerializedName("image"       ) var image       : String? = null

)
