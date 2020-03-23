package com.example.fitnesscalc

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalcInput : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculation_input)

        var intent = intent
        val calcName2 = intent.getStringExtra("EXTRA_BMI")

        val calcTitle: TextView = findViewById(R.id.calcnamE)

        try {


            calcTitle.text = calcName2
        }
        catch (e: Exception) {
            calcTitle.text = e.localizedMessage
        }
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}
