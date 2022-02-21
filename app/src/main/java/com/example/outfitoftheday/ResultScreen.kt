package com.example.outfitoftheday

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.outfitoftheday.adapter.ItemAdapter
import com.example.outfitoftheday.data.Datasource

class ResultScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.end_screen)
        val myDataset = Datasource().loadQuotes()
        val recyclerView = findViewById<RecyclerView>(R.id.result_recycle)
        recyclerView.adapter = ItemAdapter(context = this, myDataset, CustomClothes().isBlue)
        recyclerView.setHasFixedSize(true)

        val restart = findViewById<Button>(R.id.restartButton)
        restart.setOnClickListener {
            finish()
        }

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            finish()
        }
    }
}