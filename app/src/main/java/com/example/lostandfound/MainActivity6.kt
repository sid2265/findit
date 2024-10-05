package com.example.lostandfound

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        val fifthpage=findViewById<Button>(R.id.joincomm_btn)
        fifthpage.setOnClickListener(){
            val Intent5= Intent(this, MainActivity7::class.java)
            startActivity(Intent5)
        }
        val sixthpage=findViewById<Button>(R.id.createcomm_btn)
        sixthpage.setOnClickListener(){
            val Intent6= Intent(this, MainActivity8::class.java)
            startActivity(Intent6)
        }
        val seventhpage=findViewById<Button>(R.id.mycomm_btn)
        seventhpage.setOnClickListener()
        {
            val Intent7 = Intent(this, MainActivity11::class.java)
            startActivity(Intent7)
        }
    }
}