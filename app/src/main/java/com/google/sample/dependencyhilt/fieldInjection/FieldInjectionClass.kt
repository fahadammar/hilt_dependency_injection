package com.google.sample.dependencyhilt.fieldInjection

import android.util.Log
import android.view.View
import android.widget.TextView
import javax.inject.Inject

const val TAG : String = "fieldInjection"

class FieldInjectionClass @Inject constructor() {
    fun justLog(){
            Log.i(TAG, "I'm Field Injected")
    }
}

/*
*
* Field injection. Populates fields in
* @AndroidEntryPoint annotated classes.
* Fields cannot be private.
*
* */