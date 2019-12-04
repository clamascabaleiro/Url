package com.programa1.navegadorurl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBuscar.setOnClickListener{
            val intentBuscar = Intent(this, NavegadorActivity::class.java)
            intentBuscar.putExtra("url", "www.google.es")
            startActivity(intentBuscar)
        }
    }

}
