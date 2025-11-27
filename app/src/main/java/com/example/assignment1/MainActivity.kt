package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carName = findViewById<TextView>(R.id.carName)
        val carInfo = findViewById<TextView>(R.id.carInfo)
        val btnShowInfo = findViewById<Button>(R.id.btn1)

        // show carName hide carInfo
        carName.visibility = View.VISIBLE
        carInfo.visibility = View.GONE

        btnShowInfo.setOnClickListener {
            // carName → carInfo
            carName.visibility = View.GONE
            carInfo.visibility = View.VISIBLE
        }
    }
}
