package com.example.laboratorytask

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailField = findViewById<TextInputEditText>(R.id.etEmail)
        val passwordField = findViewById<TextInputEditText>(R.id.etPassword)
        val loginButton = findViewById<MaterialButton>(R.id.btnLogin)
        val forgotPassword = findViewById<MaterialTextView>(R.id.tvForgotPassword)

        loginButton.setOnClickListener {
            val email = emailField.text?.toString()?.trim()
            val password = passwordField.text?.toString()?.trim()

            if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Logging in...", Toast.LENGTH_SHORT).show()
                // TODO: Handle login logic
            }
        }

        forgotPassword.setOnClickListener {
            Toast.makeText(this, "Forgot Password clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
