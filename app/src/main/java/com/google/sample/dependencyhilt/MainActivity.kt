package com.google.sample.dependencyhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.sample.dependencyhilt.fieldInjection.FieldInjectionClass
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

// this Annotation is used for the classes, fragments etc
// (search further we shall to put this annotation)
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    // FIELD INJECTION
    @Inject
    lateinit var fieldInjectionClass: FieldInjectionClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fieldInjectionClass.justLog()
    }
}


/*
*
* Adds a DI container to the Android
* class annotated with it.
* This requires using Hilt’s Gradle Plugin.
*
* */