package com.example.fitnesscalc

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlin.math.round

class BmiResults : AppCompatActivity() {
    private val forms = Formulas()

    @SuppressLint("ResourceAsColor", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_results)

        val button: TextView = findViewById(R.id.BMI_result)
        val message: TextView = findViewById(R.id.BMI_message)
        val underweight: RelativeLayout = findViewById(R.id.Underweight_box)
        val normal: RelativeLayout = findViewById(R.id.Normal_box)
        val overweight: RelativeLayout = findViewById(R.id.overweight_box)
        val obese: RelativeLayout = findViewById(R.id.obese_box)
        val veryObese: RelativeLayout = findViewById(R.id.veryObese_box)


        val feetHeight: Int = intent.getIntExtra("FEET", 0)
        val inchesHeight: Int =intent.getIntExtra("INCH", 0)
        val weight: Int = intent.getIntExtra("WEIGHT", 0)


        val finalBMI: Float = forms.calculateBMI(weight,feetHeight, inchesHeight)




        button.text = roundppp(2, finalBMI).toString()

        when {
            finalBMI < 18.5  -> {
                button.setBackgroundColor(ContextCompat.getColor(this, R.color.underweightColor))
                message.setTextColor(ContextCompat.getColor(this, R.color.underweightColor))
                underweight.setBackgroundColor(ContextCompat.getColor(this, R.color.highlightColor))
                message.setText(R.string.underweight)


            }
            finalBMI in 18.5..24.9 -> {
                println("Number too low")
                normal.setBackgroundColor(R.color.highlightColor)
                button.setBackgroundColor(ContextCompat.getColor(this, R.color.normalColor))
                message.setTextColor(ContextCompat.getColor(this, R.color.normalColor))
                message.setText(R.string.normal)

            }
            finalBMI in 25.0..29.9    -> {
                println("Number correct")
                overweight.setBackgroundColor(R.color.highlightColor)
                button.setBackgroundColor(ContextCompat.getColor(this, R.color.overweightColor))
                message.setTextColor(ContextCompat.getColor(this, R.color.overweightColor))
                message.setText(R.string.overweight)

            }
            finalBMI in 30.0..34.9 -> {
                println("Number too high, but acceptable")
                obese.setBackgroundColor(R.color.highlightColor)
                button.setBackgroundColor(ContextCompat.getColor(this, R.color.obeseColor))
                message.setTextColor(ContextCompat.getColor(this, R.color.obeseColor))
                message.setText(R.string.obese)

            }
            finalBMI > 35.0  -> {
                println("Number too high, but acceptable")
                veryObese.setBackgroundColor(R.color.highlightColor)
                button.setBackgroundColor(ContextCompat.getColor(this, R.color.veryObeseColor))
                message.setTextColor(ContextCompat.getColor(this, R.color.veryObeseColor))
                message.setText(R.string.veryobese)

            }
            else -> println("Number too high")
        }





    }

     fun roundppp(decimals: Int, uuu: Float): Double {
        var multiplier = 1.0
        repeat(decimals) { multiplier *= 10 }
        return round(uuu * multiplier) / multiplier
    }





}
