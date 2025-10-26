package com.example.laboratorytask

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val standardButton: Button = findViewById(R.id.standardButton)
        val myImageButton: ImageButton = findViewById(R.id.myImageButton)
        val toggleSwitch: ToggleButton = findViewById(R.id.toggleSwitch)


        standardButton.setOnClickListener {
            Toast.makeText(this, "Standard Button Clicked!", Toast.LENGTH_SHORT).show()
        }


        myImageButton.setOnClickListener {
            Toast.makeText(this, "Camera Button Clicked!", Toast.LENGTH_SHORT).show()
        }


        toggleSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Toggle Switch is ON", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Toggle Switch is OFF", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
