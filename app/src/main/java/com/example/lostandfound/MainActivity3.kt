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

class MainActivity3 : AppCompatActivity() {
    private lateinit var emailid: EditText
    private lateinit var password: EditText
    private lateinit var signupbutton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        emailid = findViewById(R.id.email_input)
        password = findViewById(R.id.password_input2)
        signupbutton = findViewById(R.id.signup2_btn)

        signupbutton.setOnClickListener()
        {
            var emailidString = emailid.text.toString()
            var passwordString = password.text.toString()
            if (emailidString.isEmpty()) {
                emailid.error = "Email ID Required"
                return@setOnClickListener
            } else if (passwordString.isEmpty()) {
                password.error = "Password Required"
                return@setOnClickListener
            } else {
                Toast.makeText(this, "Welcome!!", Toast.LENGTH_SHORT).show()
                val Intent3 = Intent(this, MainActivity4::class.java)
                startActivity(Intent3)
            }

        }
    }
}