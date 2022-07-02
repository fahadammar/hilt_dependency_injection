package com.google.sample.dependencyhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.sample.dependencyhilt.fieldInjection.FieldInjectionClass
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

// this Annotation is used for the classes, fragments etc
// (search further, where to put this annotation)
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    // NOTE: We are not doing the filed injection in this activity right now - Field Injection is taking place in Fragment
    
    // FIELD OR PROPERTY  INJECTION
    /*
    @Inject
    lateinit var fieldInjectionClass: FieldInjectionClass
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        //val inflater = this.layoutInflater
        //val view = inflater.inflate(R.layout.activity_main, null)

        // Un-comment it, if you want to sett the field injection in the Activity - Right Now it's in Fragment, check it out!!
        // fieldInjectionClass.justLog()
    }
}


/*
*
* Adds a DI container to the Android
* class annotated with it.
* This requires using Hilt’s Gradle Plugin.
*
* */