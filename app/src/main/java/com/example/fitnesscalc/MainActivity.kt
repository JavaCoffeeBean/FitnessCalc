package com.example.fitnesscalc

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var calcTitle: String



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intentt: Intent = Intent(this, CalcInput::class.java)




        /* BMI_Button.setOnClickListener(View.OnClickListener {
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        })*/
        val relativeLayout: RelativeLayout = findViewById(R.id.mainActivityLayout)

        val bmi_Button: Button = findViewById(R.id.BMI_Button);
        val calorie_Button: Button = findViewById(R.id.CALORIE_Button);
        val bodyFat_Button: Button = findViewById(R.id.BODYFAT_Button);
        val bmr_Button: Button = findViewById(R.id.BMR_Button);
        val idealWeight_Button: Button = findViewById(R.id.IDEALWEIGHT_Button);

        val animationDrawable: AnimationDrawable =
            relativeLayout.getBackground() as AnimationDrawable
        animationDrawable.setEnterFadeDuration(4000)
        animationDrawable.setExitFadeDuration(4000)
        animationDrawable.start()

        //public static final String EXTRA_BMI = "com.example.fitnesscalc.EXTRA_BMI";


         bmi_Button.setOnClickListener(View.OnClickListener {
         calcTitle = bmi_Button.text.toString()
             intentt.putExtra("EXTRA_BMI", calcTitle)
             startActivity(intentt)})
        calorie_Button.setOnClickListener(View.OnClickListener {
            calcTitle = calorie_Button.text.toString()
            intentt.putExtra("EXTRA_BMI", calcTitle)
            startActivity(intentt)})
        bodyFat_Button.setOnClickListener(View.OnClickListener {
            calcTitle = bodyFat_Button.text.toString()
            intentt.putExtra("EXTRA_BMI", calcTitle)
            startActivity(intentt)})
        bmr_Button.setOnClickListener(View.OnClickListener {
            calcTitle = bmr_Button.text.toString()
            intentt.putExtra("EXTRA_BMI", calcTitle)
            startActivity(intentt)})
        idealWeight_Button.setOnClickListener(View.OnClickListener {
            calcTitle = idealWeight_Button.text.toString()
            intentt.putExtra("EXTRA_BMI", calcTitle)
            startActivity(intentt)})






    }




}

