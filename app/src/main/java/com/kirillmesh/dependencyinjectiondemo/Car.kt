package com.kirillmesh.dependencyinjectiondemo

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(
    private val carEngine: CarEngine,
    private val carBattery: CarBattery,
    private val carShassis: CarShassis
) {

    fun move() {
        Log.d(LogcatTags.LOG_TAG, "Car is moving")
    }

}