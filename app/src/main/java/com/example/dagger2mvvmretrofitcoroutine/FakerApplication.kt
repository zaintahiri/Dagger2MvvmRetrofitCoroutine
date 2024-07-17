package com.example.dagger2mvvmretrofitcoroutine

import android.app.Application
import com.example.dagger2mvvmretrofitcoroutine.di.ApplicationComponent
import com.example.dagger2mvvmretrofitcoroutine.di.DaggerApplicationComponent

class FakerApplication: Application() {

    lateinit var appComponent:ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        appComponent =DaggerApplicationComponent.builder().build()

    }

}