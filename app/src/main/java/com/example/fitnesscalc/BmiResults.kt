package com.example.fitnesscalc

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BmiResults : AppCompatActivity() {
    val forms = Formulas()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_results)

        val button: TextView = findViewById(R.id.BMI_result)



        val feetHeight: Int = intent.getIntExtra("FEET", 0)
        val inchesHeight: Int =intent.getIntExtra("INCH", 0)
        val weight: Int = intent.getIntExtra("WEIGHT", 0)

            val finalBMI: Float = forms.calculateBMI(weight,feetHeight, inchesHeight)


        button.text = finalBMI.toString()



    }


}
