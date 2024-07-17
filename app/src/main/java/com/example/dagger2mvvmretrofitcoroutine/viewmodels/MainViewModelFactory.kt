package com.example.dagger2mvvmretrofitcoroutine.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dagger2mvvmretrofitcoroutine.repositories.ProductRepository
import javax.inject.Inject

class MainViewModelFactory @Inject constructor(private  val repository: ProductRepository) :ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}