package com.example.anujapp1

import  androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var name: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.nameInput)

        today is a good day// 3rd commit, intentional error to undo commit
    }

    fun createBirthdayCard(view: View) {  println("This is containd in my 2nd commit")//This is containd in my 2nd commit
        val inputText = name.text.toString()
        Toast.makeText(this, "Happy Birthday $inputText", Toast.LENGTH_SHORT).show()
        // val
    }
}