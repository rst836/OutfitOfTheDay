package com.example.outfitoftheday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import androidx.recyclerview.widget.RecyclerView
import com.example.outfitoftheday.adapter.ItemAdapter
import com.example.outfitoftheday.data.Datasource
import com.example.outfitoftheday.R

class CustomClothes : AppCompatActivity() {
    var isBlue = arrayOf(false, false, false, false, false)

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.custom_cloth1)
        val myDataset = Datasource().loadQuotes()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(context = this, myDataset, isBlue)
        recyclerView.setHasFixedSize(true)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        button2.setOnClickListener {
            finish()
        }
        button3.setOnClickListener {
            val intent = Intent(this, ResultScreen::class.java)
            intent.putExtra("hat", isBlue[0].toString())
            intent.putExtra("shirt", isBlue[1].toString())
            intent.putExtra("jacket", isBlue[2].toString())
            intent.putExtra("pants", isBlue[3].toString())
            intent.putExtra("shoes", isBlue[4].toString())
            startActivity(intent)
        }
    }
}