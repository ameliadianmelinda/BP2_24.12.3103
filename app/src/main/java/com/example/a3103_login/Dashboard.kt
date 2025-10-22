package com.example.a3103_login

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)

        val tv_ucapan: TextView = findViewById(R.id.tv_ucapan)
        val btn_web: Button = findViewById(R.id.btn_web)

        val Username = intent.getStringExtra("nama" )

        tv_ucapan.text = "Selamat Datang! $Username"

        btn_web.setOnClickListener {
            val url = "https://amikom.ac.id"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}