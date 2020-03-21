package com.example.fitnesscalc

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val relativeLayout: RelativeLayout  = findViewById(R.id.mainActivityLayout)
        val BMI_Button: Button = findViewById(R.id.BMI_Button)
        val animationDrawable: AnimationDrawable = relativeLayout.getBackground() as AnimationDrawable
        animationDrawable.setEnterFadeDuration(4000)
        animationDrawable.setExitFadeDuration(4000)
        animationDrawable.start()

        BMI_Button.setOnClickListener(View.OnClickListener {
            val intent: Intent = Intent(this, CalcInput::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        })

        val bmi_Button: Button = findViewById(R.id.BMI_Button);
        val calorie_Button: Button = findViewById(R.id.CALORIE_Button);
        val bodyFat_Button: Button = findViewById(R.id.BODYFAT_Button);
        val bmr_Button: Button = findViewById(R.id.BMR_Button);
        val idealWeight_Button: Button = findViewById(R.id.IDEALWEIGHT_Button);



        bmi_Button.setOnClickListener(this);
        calorie_Button.setOnClickListener(this);
        bodyFat_Button.setOnClickListener(this);
        bmr_Button.setOnClickListener(this);
        idealWeight_Button.setOnClickListener(this);



    }


}

