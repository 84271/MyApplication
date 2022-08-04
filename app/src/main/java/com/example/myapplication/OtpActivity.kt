package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.widget.doOnTextChanged

class OtpActivity : AppCompatActivity() {
    lateinit var etOtp1: EditText
    lateinit var etOtp2: EditText
    lateinit var etOtp3: EditText
    lateinit var etOtp4: EditText
    lateinit var btnOtp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)
        etOtp1 = findViewById(R.id.etOtp1)
        etOtp2 = findViewById(R.id.etOtp2)
        etOtp3 = findViewById(R.id.etOtp3)
        etOtp4 = findViewById(R.id.etOtp4)
        btnOtp = findViewById(R.id.btnOtp)
        etOtp1.doOnTextChanged { text, start, before, count ->
            if((text?.length?:0)>0) {
                etOtp2.requestFocus()
            }

                }

        etOtp2.doOnTextChanged { text, start, before, count ->
            if((text?.length?:0)>0) {
                etOtp3.requestFocus()
            }
        }
        etOtp3.doOnTextChanged { text, start, before, count ->
            if((text?.length?:0)>0) {
                etOtp4.requestFocus()
            }
        }



                btnOtp.setOnClickListener {
            System.out.println("Otp Clicked")



    }
}
}