package com.example.lostandfound

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)
        val ninthpage = findViewById<Button>(R.id.reportlos_btn)
        ninthpage.setOnClickListener {
            val Intent2 = Intent(this, MainActivity10::class.java)
            startActivity(Intent2)
        }
        val tenthpage=findViewById<Button>(R.id.searchlos_btn)
        tenthpage.setOnClickListener{
            val Intent3= Intent(this, MainActivity11::class.java)
            startActivity(Intent3)
        }
    }
}