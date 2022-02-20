package com.example.outfitoftheday.data

import com.example.outfitoftheday.R
import com.example.outfitoftheday.outfit.Outfit

class Datasource {
    fun loadQuotes(): List<Outfit> {
        return listOf<Outfit>(
            Outfit(R.string.app_name, R.drawable.img),
        )
    }
}