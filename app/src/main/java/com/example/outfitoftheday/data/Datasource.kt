package com.example.outfitoftheday.data

import com.example.outfitoftheday.R
import com.example.outfitoftheday.outfit.Outfit

class Datasource {
    fun loadQuotes(): List<Outfit> {
        return listOf<Outfit>(
            Outfit(R.string.hat, R.drawable.red),
            Outfit(R.string.shirt, R.drawable.red),
            Outfit(R.string.jacket, R.drawable.red),
            Outfit(R.string.pants, R.drawable.red),
            Outfit(R.string.shoes, R.drawable.red),
            )
    }
}