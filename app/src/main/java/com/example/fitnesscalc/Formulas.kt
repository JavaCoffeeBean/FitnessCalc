package com.example.fitnesscalc

class Formulas {

    fun calculateBMI(pounds: Int, feet: Int, inches: Int) : Float {
        val finalHeight: Float = (feet.toFloat() * 12) + inches.toFloat()
        val finalHeightSquared: Float = finalHeight * finalHeight


        val finalBMI = (pounds.toFloat()/finalHeightSquared) * 703



        return finalBMI

    }



}