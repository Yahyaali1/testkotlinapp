package com.example.ibm.testkotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash_screen.*
import kotlinx.android.synthetic.main.activity_splash_screen.view.*

class SplashScreen : AppCompatActivity() {

    companion object {
         const val screenTimeout : Long = 1000;
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        textView2.setVisibility(View.INVISIBLE)



    }

    override fun onStart() {
        super.onStart()


        textView2.startAnimation(AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left))

        Handler().postDelayed({
            val mainIntent = Intent(this,MainActivity::class.java)
            startActivity(mainIntent)
            finish()

        }, screenTimeout)
    }
}
