package com.vpppcoe.registrationapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etEmail : EditText = findViewById(R.id.et_email)
        val etName : EditText = findViewById(R.id.et_name)
        val etPassword : EditText = findViewById(R.id.et_password)
        val btnRegister : Button = findViewById(R.id.btn_register)
        val tvLogin : TextView = findViewById(R.id.tv_login)

        btnRegister.setOnClickListener {
            val email : String = etEmail.text.toString()
            val name : String = etName.text.toString()
            val pass : String = etPassword.text.toString()

            if (email.isNotEmpty() && name.isNotEmpty() && pass.isNotEmpty()) {
                Log.d("email", email)
                Log.d("name", name)
                Log.d("pass", pass)
                Toast.makeText(this, "Your Name is : " + etName.text.toString(), Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Empty Fields are not allowed !", Toast.LENGTH_LONG).show()
            }
        }

        tvLogin.setOnClickListener {
            startActivity(Intent(this, LoginPage::class.java))
            finish()
        }

    }
}