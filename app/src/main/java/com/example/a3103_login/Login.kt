package com.example.a3103_login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)


        val et_Username: EditText = findViewById(R.id.et_Username)
        val et_Pass: EditText = findViewById(R.id.et_Pass)
        val btn_login: Button = findViewById(R.id.btn_login)
        val btn_daftar: Button = findViewById(R.id.btn_daftar)


        btn_login.setOnClickListener {
            val username = et_Username.text.toString().trim()
            val password = et_Pass.text.toString().trim()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Isi username dan password dulu", Toast.LENGTH_SHORT).show()
            } else {
                // Intent ke HomeActivity (bukan Dashboard lagi)
                val pindah = Intent(this, HomeActivity::class.java)
                pindah.putExtra("nama", username)
                startActivity(pindah)
            }
        }


        btn_daftar.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }
}