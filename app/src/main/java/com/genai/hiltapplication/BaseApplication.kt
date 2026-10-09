package com.genai.hiltapplication

import android.app.Application
import com.genai.hiltapplication.domain.UserRepository
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject


@HiltAndroidApp
class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()

    }
}