package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var etMail :EditText
    lateinit var etPassword:EditText
    lateinit var tvForgotPassword:TextView
    lateinit var btnLogin:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etMail = findViewById (R.id.etmail)
        etPassword = findViewById(R.id.etPassword)
        tvForgotPassword = findViewById(R.id.tvForgetPassword)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener{
           System.out.println("Login Clicked")
        var email = etMail.text.toString()
            var password = etPassword.text.toString()
        System.out.println("email $email")
    if(email.isNullOrEmpty()) {
        etMail.error =resources.getString(R.string.please_enter_email)
        etMail.requestFocus()
    }
            else if (password.isNullOrEmpty()) {
        etPassword.error =resources.getString(R.string.please_enter_password)
        etPassword.requestFocus()
    }
            else if (password.length<6) {
        etPassword.error =resources.getString(R.string.password_should_be_greater_than_6)
        etPassword.requestFocus()
            }
            else {
                Toast.makeText ( this, resources.getString (R.string.login_successfully),Toast.LENGTH_LONG ).show()
        finish()
    }

    }
        
    }


    override fun onResume() {
        super.onResume()
    }
}