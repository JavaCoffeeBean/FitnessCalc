package com.example.fitnesscalc

import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BmiResults : AppCompatActivity() {
    val forms = Formulas()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_results)

        val button: TextView = findViewById(R.id.BMI_result)
        val underweight: RelativeLayout = findViewById(R.id.Underweight_box)
        val normal: RelativeLayout = findViewById(R.id.Normal_box)
        val overweight: RelativeLayout = findViewById(R.id.overweight_box)
        val obese: RelativeLayout = findViewById(R.id.obese_box)
        val veryObese: RelativeLayout = findViewById(R.id.veryObese_box)



        val feetHeight: Int = intent.getIntExtra("FEET", 0)
        val inchesHeight: Int =intent.getIntExtra("INCH", 0)
        val weight: Int = intent.getIntExtra("WEIGHT", 0)


            val finalBMI: Float = forms.calculateBMI(weight,feetHeight, inchesHeight)


        button.text = finalBMI.toString()

        when(finalBMI) {
            >18.5 -> underweight.background =
            18.5..24.9 -> println("Number too low")
            3 -> println("Number correct")
            4 -> println("Number too high, but acceptable")
            else -> println("Number too high")
        }



    }


}
