package com.example.lostandfound

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity10 : AppCompatActivity() {
    private lateinit var itemname: EditText
    private lateinit var location: EditText
    private lateinit var colour: EditText
    private lateinit var submitbutton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)
        itemname=findViewById(R.id.itemname_input)
        location=findViewById(R.id.loc_input)
        colour=findViewById(R.id.colour_input)
        submitbutton=findViewById(R.id.submit_btn)

        submitbutton.setOnClickListener()
        {
            val itemnamestring=itemname.text.toString()
            val locstring=location.text.toString()
            val colourstring=colour.text.toString()
            if(itemnamestring.isEmpty())
            {
                itemname.error="Name Required"
                return@setOnClickListener
            }
            else if(locstring.isEmpty())
            {
                location.error="Location Required"
                return@setOnClickListener
            }
            else if(colourstring.isEmpty())
            {
                colour.error="Colour Required"
                return@setOnClickListener
            }
            else
            {
                Toast.makeText(this,"Report Added ThankYou!! ", Toast.LENGTH_LONG).show()
                val Intent2= Intent(this, MainActivity12::class.java)
                startActivity(Intent2)
            }
        }


    }
}