package com.example.lostandfound

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstpage = findViewById<Button>(R.id.login1btn)
        firstpage.setOnClickListener {
            val Intent1 = Intent(this, MainActivity2::class.java)
            startActivity(Intent1)
        }
        val secondpage = findViewById<Button>(R.id.signup1btn)
        secondpage.setOnClickListener {
            val Intent2 = Intent(this, MainActivity3::class.java)
            startActivity(Intent2)
        }
    }
}