package com.kirillmesh.dependencyinjectiondemo

import javax.inject.Inject

class CarEngine @Inject constructor(private val engineFlap: EngineFlap) {

}
