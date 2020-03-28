package com.example.fitnesscalc

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BmiResults : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_results)

        val button: TextView = findViewById(R.id.BMI_result)


        val bmiScore: Float = intent.getFloatExtra("BMISCORE", 0f)


        button.text = bmiScore.toString()



    }


}
