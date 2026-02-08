package com.example.lab3

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Film(
    @DrawableRes val imageResId: Int,
    @StringRes val day: Int,
    @StringRes val nameFile: Int,
    @StringRes val descShort: Int,
    @StringRes val descFull: Int
)
