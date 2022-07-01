package com.google.sample.dependencyhilt.fieldInjection

import android.util.Log
import javax.inject.Inject

const val TAG : String = "DI"

class FieldInjectionClass @Inject constructor() {
    fun justLog(){
        Log.i(TAG, "I'm Field Injected")
    }
}