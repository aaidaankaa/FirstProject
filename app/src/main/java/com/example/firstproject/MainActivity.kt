package com.example.firstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.sax.StartElementListener
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    lateinit var firstName: EditText
    lateinit var age:EditText
    lateinit var bithDate:EditText

    lateinit var saveBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstName=findViewById(R.id.FirstName)
        age=findViewById(R.id.age)
        bithDate=findViewById(R.id.birthDate)
        saveBtn= findViewById(R.id.saveBtn)

        saveBtn. setOnClickListener {
            val name= firstName.text.toString()
            val ageText=age.text.toString()
            val birth= bithDate.text.toString()
            val intent=Intent(this,SecondActivity::class.java)
            intent.putExtra("firstName", name)
            intent.putExtra("age", ageText)
            intent.putExtra("birthDate", birth)
            startActivity(intent)




        }


    }
}