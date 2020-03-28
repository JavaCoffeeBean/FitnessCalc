package com.example.fitnesscalc

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.reflect.KClass

class BmiResults : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_results)

        val button: TextView = findViewById(R.id.BMI_result)
        val popp = Formulas()
        popp.calculateBMI()


        val feetHeight: Int =
        val inchesHeight: Int =
        val weight: Int =

            val finalBMI: Float =


        button.text = bmiScore.toString()



    }


}
