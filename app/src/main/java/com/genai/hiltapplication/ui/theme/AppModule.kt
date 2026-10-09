package com.genai.hiltapplication.ui.theme

import com.genai.hiltapplication.Car
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    @Singleton
    fun getData():String{
        return "hello hilt"
    }

    @Provides
    @Singleton
    fun getCarData():Car{
        return Car()
    }

}