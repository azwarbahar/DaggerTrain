package com.azwar.daggertrain3

import javax.inject.Inject
import javax.inject.Named

class PetrolEngine : Engine {

    var powerCapacity:Int
    var engineCapacity:Int

    @Inject
    constructor(@Named("power")powerCapacity:Int, @Named("engine")engineCapacity:Int){
        this.powerCapacity  = powerCapacity
        this.engineCapacity = engineCapacity
    }

    override fun start(){
        System.out.println("Petrol Engine started : powerCapacity : "+powerCapacity+ "engineCapacity : "+engineCapacity)
    }
}