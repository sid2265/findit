package com.example.lostandfound

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity7 : AppCompatActivity() {
    private lateinit var commid: EditText
    private lateinit var joinbutton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        commid=findViewById(R.id.commid_input)
        joinbutton=findViewById(R.id.join_btn)

        joinbutton.setOnClickListener()
        {
            var commidstring=commid.text.toString()
            if(commidstring.isEmpty())
            {
                commid.error="Community ID Required"
                return@setOnClickListener
            }
            else
            {
                Toast.makeText(this,"Welcome to the Community", Toast.LENGTH_SHORT).show()
                val Intent7=Intent(this, MainActivity9::class.java)
                startActivity(Intent7)
            }

        }
    }
}