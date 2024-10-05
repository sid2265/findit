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

class MainActivity4 : AppCompatActivity() {
    private lateinit var name: EditText
    private lateinit var surname: EditText
    private lateinit var department: EditText
    private lateinit var prn: EditText
    private lateinit var nextbutton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        name=findViewById(R.id.name_input)
        surname=findViewById(R.id.sur_input)
        department=findViewById(R.id.dept_input)
        prn=findViewById(R.id.prn_input)
        nextbutton=findViewById(R.id.next_btn)

        nextbutton.setOnClickListener()
        {
            var namestring=name.text.toString()
            var surnamestring=surname.text.toString()
            var deptstring=department.text.toString()
            var prnstring=prn.text.toString()
            if(namestring.isEmpty())
            {
                name.error="Name Required"
                return@setOnClickListener
            }
            else if(surnamestring.isEmpty())
            {
                surname.error="Surname Required"
                return@setOnClickListener
            }
            else if(deptstring.isEmpty())
            {
                department.error="Department Required"
                return@setOnClickListener
            }
            else if(prnstring.isEmpty())
            {
                prn.error="PRN Required"
                return@setOnClickListener
            }
            else{
                Toast.makeText(this,"One Step to Go!",Toast.LENGTH_LONG).show()
                val Intent4=Intent(this, MainActivity5::class.java)
                startActivity(Intent4)
            }
        }
    }
}