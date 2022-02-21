package com.example.outfitoftheday

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ResultScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.end_screen)
        val hat = intent.getStringExtra("hat").toBoolean()
        val shirt = intent.getStringExtra("shirt").toBoolean()
        val jacket = intent.getStringExtra("jacket").toBoolean()
        val pants = intent.getStringExtra("pants").toBoolean()
        val shoes = intent.getStringExtra("shoes").toBoolean()
        if (!hat){
            val hatColor = findViewById<ImageView>(R.id.hatView)
            hatColor.setImageResource(R.drawable.red)
        }
        if (!shirt){
            val shirtColor = findViewById<ImageView>(R.id.shirtView)
            shirtColor.setImageResource(R.drawable.red)
        }
        if (!jacket){
            val jacketColor = findViewById<ImageView>(R.id.jacketView)
            jacketColor.setImageResource(R.drawable.red)
        }
        if (!pants){
            val pantsColor = findViewById<ImageView>(R.id.pantsView)
            pantsColor.setImageResource(R.drawable.red)
        }
        if (!shoes){
            val shoeColor = findViewById<ImageView>(R.id.shoesView)
            shoeColor.setImageResource(R.drawable.red)
        }


        val restart = findViewById<Button>(R.id.restartButton)
        restart.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            finish()
        }
    }
}