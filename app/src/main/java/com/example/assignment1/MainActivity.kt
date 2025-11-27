package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carName = findViewById<TextView>(R.id.carName)
        val carInfo = findViewById<TextView>(R.id.carInfo)
        val btnShowInfo = findViewById<Button>(R.id.btn1)

        val editText = findViewById<EditText>(R.id.editText)
        val btnSubmit = findViewById<Button>(R.id.btn2)
        val userTextView = findViewById<TextView>(R.id.userTextView)

        //show carName hide carInfo
        carName.visibility = View.VISIBLE
        carInfo.visibility = View.GONE
        userTextView.visibility = View.GONE

        // carName -> carInfo
        btnShowInfo.setOnClickListener {
            carName.visibility = View.GONE
            carInfo.visibility = View.VISIBLE
        }

        // show the text on userTextView
        btnSubmit.setOnClickListener {
            val userInput = editText.text.toString().trim()

            if (userInput.isNotEmpty()) {
                userTextView.text = userInput
                userTextView.visibility = View.VISIBLE
                editText.text.clear()
            }
        }
    }
}
