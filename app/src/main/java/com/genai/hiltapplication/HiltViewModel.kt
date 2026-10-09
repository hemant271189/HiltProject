package com.genai.hiltapplication

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class HiltViewModel @Inject constructor(private val exampleData:String,
                                        private val car:Car):ViewModel() {

    fun getMessage():String{
        return exampleData
    }

    fun getCarName():String{
        return car.getCarName()
    }

    fun getCarSpeed():Int{
        return car.getCarSpeed()
    }
}