package com.example.outfitoftheday.outfit

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Outfit (@StringRes val stringResourceID: Int,
                   @DrawableRes var imageResourceID: Int) {
}