package com.example.dagger2mvvmretrofitcoroutine.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dagger2mvvmretrofitcoroutine.models.Product
import com.example.dagger2mvvmretrofitcoroutine.repositories.ProductRepository
import kotlinx.coroutines.launch

class MainViewModel(private val productRepository: ProductRepository): ViewModel() {

    val productsLiveData:LiveData<List<Product>>
    get() = productRepository.products

    init {
        viewModelScope.launch {
            productRepository.getProducts()
        }
    }
}