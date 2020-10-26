package com.azwar.daggertrain3

import javax.inject.Inject

class Remote {
    lateinit var car: Car

    @Inject
    constructor(){

    }

    fun providerCar(car: Car){
        System.out.println("providing car to remote")
        this.car = car
    }
}