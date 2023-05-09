package com.kirillmesh.dependencyinjectiondemo

import android.util.Log
import javax.inject.Inject


class LithiumCarBattery @Inject constructor(): CarBattery {

    override fun logCarBatteryType() {
        Log.d(LogcatTags.LOG_TAG, "This is Li-Ion battery!")
    }

}