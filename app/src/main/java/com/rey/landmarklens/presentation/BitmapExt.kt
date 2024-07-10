package com.rey.landmarklens.presentation

import android.graphics.Bitmap

fun Bitmap.centreCrop(desiredWidth: Int, desiredHeight: Int): Bitmap{
    val xStart = (width - desiredWidth) / 2
    val yStart = (height - desiredHeight) / 2

    if (xStart < 0 || yStart < 0 || desiredHeight > height || desiredWidth > width){
        throw IllegalArgumentException("Invalid arguments for centre cropping")
    }

    return Bitmap.createBitmap(this, xStart, yStart, desiredWidth, desiredHeight)
}