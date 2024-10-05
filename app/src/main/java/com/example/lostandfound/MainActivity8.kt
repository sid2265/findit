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

class MainActivity8 : AppCompatActivity() {
    private lateinit var commname: EditText
    private lateinit var commid: EditText
    private lateinit var createbutton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)
        commname=findViewById(R.id.cname_input)
        commid=findViewById(R.id.cid_input)
        createbutton=findViewById(R.id.create_btn)

        createbutton.setOnClickListener()
        {
            val commnamestring=commname.text.toString()
            val commidstring=commid.text.toString()
            if(commnamestring.isEmpty())
            {
                commname.error="Community Name Required"
                return@setOnClickListener
            }
            else if(commidstring.isEmpty())
            {
                commid.error="Community ID required"
                return@setOnClickListener
            }
            else
            {
                Toast.makeText(this,"Community Created Successfully", Toast.LENGTH_SHORT).show()
                val Intent8= Intent(this, MainActivity9::class.java)
                startActivity(Intent8)
            }
        }
    }
}