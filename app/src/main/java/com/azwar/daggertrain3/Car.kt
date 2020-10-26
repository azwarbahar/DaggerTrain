package com.azwar.daggertrain3

import javax.inject.Inject

class Car {

    @Inject
    lateinit var wheels: Wheels;
    lateinit var engine: Engine;
    lateinit var driver: Driver;

    @Inject
    constructor(engine: Engine, driver: Driver){
        this.engine = engine
        this.driver = driver
    }

    @Inject
    fun provideCarToRemote(remote: Remote){
        remote.providerCar(this)
    }

    fun start(){
        System.out.println("Driver :"+driver)
//        System.out.println("Wheels: "+wheels)
//        engine.start()
//        System.out.println("Diving...")
    }

}