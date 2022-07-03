package com.google.sample.dependencyhilt.module_installIn

import android.util.Log

// INTERFACE
interface InterfaceOfObjects {
    fun logObjects()
}

const val TAG = "tagCheck"

// Now as you see, the @Inject notation can't be used here. So what to do?? let's see
class ReturnObjects : InterfaceOfObjects {
    override fun logObjects() {
        Log.d(TAG , "The ReturnObjects is called here")
    }
}

class ReturnObject : InterfaceOfObjects {
    override fun logObjects() {
        Log.d(TAG , "The ReturnObject is called here")
    }

}

class ObjectOfReturn : InterfaceOfObjects {
    override fun logObjects() {
        Log.d(TAG , "The ObjectOfReturn is called here")
    }

}