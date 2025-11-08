package com.example.xmlresourceslab


import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)
       val button = findViewById<Button?>(R.id.button)
       Log.i("DEBUG_TAG", "MainActivity started successfully")




   }
}
