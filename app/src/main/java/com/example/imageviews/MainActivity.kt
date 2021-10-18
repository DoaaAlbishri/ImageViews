package com.example.imageviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var imageView : ImageView
    lateinit var button1 : Button
    lateinit var button2 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1=findViewById(R.id.button1)
        button2=findViewById(R.id.button2)
        imageView=findViewById(R.id.imageView)
        button1.setOnClickListener {
            imageView.setImageResource(R.drawable.day)
        }
        button2.setOnClickListener {
            imageView.setImageResource(R.drawable.night)
        }
    }
}