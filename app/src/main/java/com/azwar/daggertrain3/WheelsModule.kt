package com.azwar.daggertrain3

import dagger.Module
import dagger.Provides

@Module
class WheelsModule {


    @Provides
    fun provideRims():Rims{
        System.out.println("Rims Created")
        return Rims()
    }

    @Provides
    fun provideTires():Tires{
        System.out.println("Tires Created")
        return Tires()
    }

    @Provides
    fun providesWheels(rims: Rims, tires: Tires):Wheels{
        System.out.println("Wheels Module")
        return Wheels(rims, tires)
    }

}