package com.example.dagger2mvvmretrofitcoroutine.di

import com.example.dagger2mvvmretrofitcoroutine.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
}