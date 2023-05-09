package com.kirillmesh.dependencyinjectiondemo

import dagger.Component


@Component(modules = [CarShassisModule::class, LithiumCarBatteryModule::class])
interface CarComponent {

    fun inject(mainActivity: MainActivity)
    //fun getCar(): Car

}