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

class MainActivity2 : AppCompatActivity() {

    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var loginbutton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        username = findViewById(R.id.username_input)
        password = findViewById(R.id.password_input)
        loginbutton = findViewById(R.id.login2btn)

        loginbutton.setOnClickListener()
        {
            var usernameString = username.text.toString()
            var passwordString = password.text.toString()
            if (usernameString.isEmpty()) {
                username.error = "Username Required"
                return@setOnClickListener
            } else if (passwordString.isEmpty()) {
                password.error = "Password Required"
                return@setOnClickListener
            } else {
                Toast.makeText(this, "Logged In Successfully", Toast.LENGTH_SHORT).show()
                val Intent3 = Intent(this, MainActivity6::class.java)
                startActivity(Intent3)
            }
        }
    }
    }


