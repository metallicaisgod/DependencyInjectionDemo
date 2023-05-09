package com.kirillmesh.dependencyinjectiondemo

import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class CarShassisModule (private val weight: Int) {

    @Provides
    fun provideCarShassis(): CarShassis{
        Log.d(LogcatTags.LOG_TAG, "Car shassis weight is $weight")
        return CarShassis()
    }

}