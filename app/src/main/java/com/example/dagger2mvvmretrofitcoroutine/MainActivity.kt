package com.example.dagger2mvvmretrofitcoroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.dagger2mvvmretrofitcoroutine.viewmodels.MainViewModel
import com.example.dagger2mvvmretrofitcoroutine.viewmodels.MainViewModelFactory
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel

    private val tvProducts:TextView
    get() = findViewById(R.id.tvProducts)
    // this object will be created when (application as FakerApplication).appComponent.inject(this)
    // executed
    //because we have applied @Inject annotation on its constructor, so object will be provided by
    // dagger
    @Inject
    lateinit var mainViewModelFactory: MainViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as FakerApplication).appComponent.inject(this)
        mainViewModel=ViewModelProvider(this,mainViewModelFactory).get(MainViewModel::class.java)

        mainViewModel.productsLiveData.observe(this, {
            tvProducts.text=it.joinToString { x -> x.title + "\n\n" }
        })
    }
}