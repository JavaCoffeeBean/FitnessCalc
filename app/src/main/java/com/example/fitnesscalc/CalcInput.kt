package com.example.fitnesscalc

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
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
        radioGroup = findViewById(R.id.radioGroup)
        weightt = findViewById(R.id.weightInput)

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

    fun checkButton(v:View) {
        val radioId: Int = radioGroup.checkedRadioButtonId

        radiobutton = findViewById(radioId)

        if (radiobutton.text.toString() == "Male") {
            genderMale = true
        }else{
            genderMale = false
        }

        weightt.setText(genderMale.toString())



    }
}
