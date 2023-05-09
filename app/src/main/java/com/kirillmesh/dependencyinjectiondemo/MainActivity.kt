package com.kirillmesh.dependencyinjectiondemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var carComponent: CarComponent = DaggerCarComponent.create()
        var carComponent: CarComponent = DaggerCarComponent.builder()
            .carShassisModule(CarShassisModule(1000)).build()
        carComponent.inject(this)

//        val engineFlap = EngineFlap()
//        val carEngine = CarEngine(engineFlap)
//        val carBattery = CarBattery()
//        val carShassis = CarShassis()
//
//        val car = Car(carEngine, carBattery, carShassis)

        car.move()

    }
}