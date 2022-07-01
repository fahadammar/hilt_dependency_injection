package com.google.sample.dependencyhilt

import android.app.Application
import com.google.sample.dependencyhilt.fieldInjection.FieldInjectionClass
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

// We Need to use this notation for the application class - This Annotation behind the scenes generate the Dagger code
@HiltAndroidApp
class ApplicationClass : Application() {

    // Fields cannot be private!!
    @Inject
    lateinit var fieldInjectionClass: FieldInjectionClass

    override fun onCreate() {
        super.onCreate()

        // Field Injection
        fieldInjectionClass.justLog()
    }
}

/*
* Annotation: @HiltAndroidApp
*
* Usage: Kicks off Hilt code generation.Must annotate the Application class.
*
* */

