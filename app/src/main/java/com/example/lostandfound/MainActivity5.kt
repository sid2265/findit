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

class MainActivity5 : AppCompatActivity() {
    private lateinit var username:EditText
    private lateinit var password: EditText
    private lateinit var conpassword: EditText
    private lateinit var signupbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
         username=findViewById(R.id.setuser_input)
        password=findViewById(R.id.setpass_input)
        conpassword=findViewById(R.id.confirmpass_input)
        signupbutton=findViewById(R.id.upsign_btn)

        signupbutton.setOnClickListener()
        {
            val userstring=username.text.toString()
            val passstring=password.text.toString()
            val conpassstring=conpassword.text.toString()
            if(userstring.isEmpty())
            {
                username.error="Username Required"
                return@setOnClickListener
            }
            else if(passstring.isEmpty())
            {
                password.error="Password Required"
                return@setOnClickListener
            }
            else if(conpassstring.isEmpty())
            {
                conpassword.error="Confirmation of Password Required"
                return@setOnClickListener
            }
            else
            {
                if(passstring!=conpassstring)
                {
                    Toast.makeText(this,"Passwords Doesn't Match",Toast.LENGTH_LONG).show()
                    return@setOnClickListener
                }
                else{
                    Toast.makeText(this,"FindIt! Welcomes you",Toast.LENGTH_LONG).show()
                    val Intent5=Intent(this, MainActivity6::class.java)
                    startActivity(Intent5)
                }
            }
        }
    }
}