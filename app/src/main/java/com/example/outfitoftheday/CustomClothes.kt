package com.example.outfitoftheday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CustomClothes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.custom_cloth1)
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener{
            finish()
        }
    }
}