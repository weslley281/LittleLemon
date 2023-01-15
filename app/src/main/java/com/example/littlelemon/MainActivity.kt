package com.example.littlelemon

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var toplayout : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toplayout = findViewById(R.id.toplayout)
        toplayout.setBackgroundColor(Color.parseColor("#495E57"))
        var textview = TextView(this)
        textview.text = resources.getText(R.string.litle_lemon)
        textview.setTextColor((Color.parseColor("#F4CE14")))
        toplayout.addView(textview)
    }
}