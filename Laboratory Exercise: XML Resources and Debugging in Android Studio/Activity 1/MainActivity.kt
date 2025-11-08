package com.example.xmlresourceslab


import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.ComponentActivity


Activity_main.xml


<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
   android:layout_width="match_parent"
   android:layout_height="match_parent"
   android:orientation="vertical"
   android:gravity="center">


   <TextView
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:text="@string/welcome_message"
       android:textAlignment="center"
       android:textSize="18sp"/>


   <Button
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:text="@string/button_text"
       android:layout_marginTop="20dp"
       android:id="@+id/button"/>
</LinearLayout>






class MainActivity : ComponentActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)
       val button = findViewById<Button?>(R.id.button)
       Log.i("DEBUG_TAG", "MainActivity started successfully")




   }
}
