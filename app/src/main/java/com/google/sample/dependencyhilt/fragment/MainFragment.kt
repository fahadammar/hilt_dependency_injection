package com.google.sample.dependencyhilt.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.sample.dependencyhilt.R
import com.google.sample.dependencyhilt.constructorInjection.ConstructorInjection
import com.google.sample.dependencyhilt.fieldInjection.FieldInjectionClass
import com.google.sample.dependencyhilt.module_installIn.InterfaceOfObjects
import com.google.sample.dependencyhilt.module_installIn.ObjectModule
import com.google.sample.dependencyhilt.module_installIn.ReturnObjects
import com.google.sample.dependencyhilt.module_installIn.TheNamedAnnotaion
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

// The Same Annotation used, as used for the activity
@AndroidEntryPoint
class MainFragment : Fragment() {

    // NOTE: right now the field injection is not being done, now the constructor injection is been done

    /*
    @Inject
    lateinit var fieldInjectionClass: FieldInjectionClass
    */

    /*
    @Inject
    lateinit var constructorInjection: ConstructorInjection
     */


    // We are writing the name here to tell that we want this object. Writing the names can by a typo mistake
    // There is a better option too. To Make a annotation and make that the name. Let's see the implementation
    @Inject
    @TheNamedAnnotaion
    lateinit var interfaceOfObjects: InterfaceOfObjects


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Field injection done, check the Logcat
        //fieldInjectionClass.justLog()

        /*
         The Constructor Injection is done in the class ConstructorInjection
         callingLog function is basically calling the function of class FieldInjection justLog()
         ConstructorInjection needs the objects of FieldInjection, hence the object is passed or
         provided to the ConstructorInjection class via the constructor - This is known as Constructor Injection
        */
        //constructorInjection.callingLog()


        interfaceOfObjects.logObjects()



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