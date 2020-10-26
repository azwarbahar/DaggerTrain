package com.azwar.daggertrain3

import javax.inject.Inject

class DieselEngine : Engine {


    @Inject
    constructor(){

    }

    override fun start(){
        System.out.println("Diesel Engine started")
    }
}