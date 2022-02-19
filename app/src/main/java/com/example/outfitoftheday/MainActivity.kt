package com.example.outfitoftheday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1 = findViewById<Button>(R.id.myButton)
        button1.setOnClickListener{
            val intent = Intent(this, CustomClothes::class.java)
            startActivity(intent)
        }
    }
}