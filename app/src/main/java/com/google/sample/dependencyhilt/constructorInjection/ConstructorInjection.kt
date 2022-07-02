package com.google.sample.dependencyhilt.constructorInjection

import com.google.sample.dependencyhilt.fieldInjection.FieldInjectionClass
import javax.inject.Inject

// This is the constructor Injection
class ConstructorInjection @Inject constructor(var fieldInjectionClass: FieldInjectionClass) {
    fun callingLog(){
        fieldInjectionClass.justLog("Constructor Injection is done")
    }
}

/*
*  The Hilt will see the constructor and will provide what's needed.
*  If Hilt can't provide or fulfill the necessity. The Hilt will throw
*  the error.
*
* */