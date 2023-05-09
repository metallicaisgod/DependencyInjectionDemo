package com.kirillmesh.dependencyinjectiondemo

import dagger.Module
import dagger.Provides

@Module
class LithiumCarBatteryModule {

    @Provides
    fun provideCarBattery(lithiumCarBattery: LithiumCarBattery): CarBattery{
        lithiumCarBattery.logCarBatteryType()
        return lithiumCarBattery
    }

}