package com.google.sample.dependencyhilt.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.sample.dependencyhilt.R
import com.google.sample.dependencyhilt.fieldInjection.FieldInjectionClass
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

// The Same Annotation used, as used for the activity
@AndroidEntryPoint
class MainFragment : Fragment() {

    @Inject
    lateinit var fieldInjectionClass: FieldInjectionClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Field injection done, check the Logcat
        fieldInjectionClass.justLog()


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }
}

/*
*  Important Point
*  As we annotated the Fragment with the @AndroidEntryPoint
*  In whichever activity it's going to be used, that activity also should contain this annotation -> @AndroidEntryPoint
*  we do field injection in that activity or not, still we need to annotate that activity.
* */