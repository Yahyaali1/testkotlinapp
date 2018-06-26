package com.example.ibm.testkotlinapp

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

import java.util.*

class second : Activity() {

    companion object {
        const val Total_Count = "total_count"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val count = intent.getIntExtra(Total_Count,0)
        showCount(count)
    }
    fun showCount(count:Int){
        val randNumb= Random()
        var randValue=0

        if (count>0){
            randValue=randNumb.nextInt(count+1)
        }
        //random value to be found
        textView.text = randValue.toString()
        textLabel.text = getString(R.string.textlabel,count)

    }
}
