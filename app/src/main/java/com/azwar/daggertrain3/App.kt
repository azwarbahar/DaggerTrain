package com.azwar.daggertrain3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

open class App : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*val carComponent = DaggerCarComponent.builder()
                .petrolEngineModule(PetrolEngineModule(100))
                .build()
        carComponent.inject(this)*/
    }
}