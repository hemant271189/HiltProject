package com.genai.hiltapplication.domain

import android.util.Log
import javax.inject.Inject

const val TAG ="UserRepo"

class UserRepository @Inject constructor() {

    fun saveUser(email  :String, name: String){
        Log.d(TAG, "saveUser: User saved")
    }

}