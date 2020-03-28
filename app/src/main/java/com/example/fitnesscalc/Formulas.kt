package com.example.fitnesscalc

class Formulas {

    fun calculateBMI(pounds: Int, feet: Int, inches: Int) : Float {
        val finalHeight: Int = (feet * 12) + inches
        val finalHeightSquared: Int = finalHeight * finalHeight


        val finalBMI = (pounds/finalHeightSquared) * 703



        return finalBMI.toFloat()

    }
}