package com.reysl.information_about_cities

import android.widget.ImageView
import coil.load
import java.text.NumberFormat

fun formatNumber(number: Long): String {
    return NumberFormat.getInstance().format(number)
}

suspend fun loadSvg(imageView: ImageView, url: String) {
    imageView.load(url)
}

