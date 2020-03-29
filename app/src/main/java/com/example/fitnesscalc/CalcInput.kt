package com.example.fitnesscalc

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlin.properties.Delegates

class CalcInput : AppCompatActivity() {

    lateinit var radiobutton: RadioButton
    lateinit var radioGroup: RadioGroup
    var genderMale by Delegates.notNull<Boolean>()
    lateinit var weightt: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculation_input)

        var intent = intent
        val calcName2 = intent.getStringExtra("EXTRA_BMI")

        val calcTitle: TextView = findViewById(R.id.calcnamE)
        val calcButton: Button = findViewById(R.id.calcButton)

        val heightFeet: EditText = findViewById(R.id.feet_input)
        val heightInch: EditText = findViewById(R.id.inches_input)
        val age: EditText = findViewById(R.id.ageInput)
        val weight: EditText = findViewById(R.id.weightInput)



        radioGroup = findViewById(R.id.radioGroup)
        weightt = findViewById(R.id.weightInput)
        try {


            calcTitle.text = calcName2
        }
        catch (e: Exception) {
            calcTitle.text = e.localizedMessage
        }

        calcButton.setOnClickListener(View.OnClickListener {
            val inchy: Int = heightInch.text.toString().toInt()
            val feet: Int = heightFeet.text.toString().toInt()
            val pounds: Int = weight.text.toString().toInt()




            var intentB: Intent = Intent(this, BmiResults::class.java)
            intentB.putExtra("WEIGHT", pounds)
            intentB.putExtra("INCH", inchy)
            intentB.putExtra("FEET", feet)
            startActivity(intentB)
        })
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }

    fun checkButton(v:View) {
        val radioId: Int = radioGroup.checkedRadioButtonId

        radiobutton = findViewById(radioId)

        if (radiobutton.text.toString() == "Male") {
            genderMale = true
        }else{
            genderMale = false
        }

        /*weightt.setText(genderMale.toString())*/



    }

    /*fun calculateBMI(pounds: Int, feet: Int, inches: Int) : Float {
        val finalHeight: Int = (feet * 12) + inches
        val finalHeightSquared: Int = finalHeight * finalHeight


        var finalBMI = pounds/finalHeightSquared



        return finalBMI.toFloat()

    }*/
}
