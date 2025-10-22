package com.example.a3103_login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        val et_RegUsername: EditText = findViewById(R.id.et_reg_username)
        val et_RegPassword: EditText = findViewById(R.id.et_reg_password)
        val et_RegUlangiPassword: EditText = findViewById(R.id.et_reg_ulangi_password)
        val btn_Register: Button = findViewById(R.id.btn_register)
        val btn_BackToLogin: Button = findViewById(R.id.btn_back_to_login)


        btn_BackToLogin.setOnClickListener {
            finish()
        }

        btn_Register.setOnClickListener {
            val  username = et_RegUsername.text.toString()
            val pindah = Intent (this, Dashboard::class.java)
            pindah.putExtra("nama", username)
            startActivity(pindah)
        }
    }
}