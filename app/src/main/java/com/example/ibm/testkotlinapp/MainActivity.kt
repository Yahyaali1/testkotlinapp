package com.example.ibm.testkotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private var isSickTextView: TextView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        isSickTextView = iSick

    }
    fun makeToast(view: View){
        val newToast= Toast.makeText(this,"This is smaller sequence",Toast.LENGTH_LONG)
        newToast.show()
    }
    fun countClicks(view:View){
        var count:Int = Integer.parseInt(isSickTextView?.text.toString())
        count++
        isSickTextView?.text = count.toString()

    }
    fun RandActivity(view:View){
        var currentCount:Int = Integer.parseInt(isSickTextView?.text.toString())

        val randIntent = Intent(this,second::class.java)
        randIntent.putExtra(second.Total_Count,currentCount)
        startActivity(randIntent)
    }
}
