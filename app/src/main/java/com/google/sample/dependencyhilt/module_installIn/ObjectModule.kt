package com.google.sample.dependencyhilt.module_installIn

import com.google.sample.dependencyhilt.MainActivity
import com.google.sample.dependencyhilt.fragment.MainFragment
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import javax.inject.Named

// This way we define a module. All the methods in it tell us that how to create the object of any dependency
// Any such dependency which object can't be created directly, in simple you can't use the @Inject there.
// Then we use the @Module
@InstallIn(FragmentComponent::class)
@Module
class ObjectModule {
    // NOTE: with module we also need to provide the addition information
    // or to use an additional annotation which provides addition information
    // Annotation @InstallIn


    // Whenever the Hilt needs the object of InterfaceObjects, hilt will call this function
    @Provides
    @Named("returnObjects")
    fun returnObjecstModule() : InterfaceOfObjects{
        // Return the object of class ReturnObjects
        return ReturnObjects()
    }

    @Provides
    // This below is done, to avoid the typos. It's the suggestable way
    @TheNamedAnnotaion
    fun returnObjectModule() : InterfaceOfObjects{
        return ReturnObject()
    }
}


/*
*
* @Module
* Class in which you can add bindings for
* types that cannot be constructor injected.
*
* */

/*
*
* @Provides
* Adds a binding for a type that cannot be
* constructor injected:
* - Return type is the binding type.
* - Parameters are dependencies.
* - Every time an instance is needed, the
* function body is executed if the type is
* not scoped.
*
* */

/*
*
*
* @InstallIn
* Indicates in which Hilt-generated DI
* containers (SingletonComponent in the
* code) module bindings must be available.
*
* Do check the component Hierarchy
* URL: https://is.gd/grX3CR
*
* Well if the InstallIn is done in the Fragment according to hierarchy
* The stuff below the fragment can access the Object but above the fragment can't
* similarly when the InstallIn is done at the activity, the below stuff the activity
* can access the object but not the above activity.
* i.e if the @InstallIn is done at the activity then the below fragment can easily access the object
* you can do this experiment by changing the stuff @InstallIn
* */