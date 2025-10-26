package com.example.a3103_login

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        val et_RegUsername: EditText = findViewById(R.id.et_reg_username)
        val et_RegPassword: EditText = findViewById(R.id.et_reg_password)
        val et_RegUlangiPassword: EditText = findViewById(R.id.et_reg_ulangi_password)
        val rgGender: RadioGroup = findViewById(R.id.rg_gender)
        val cbTerms: CheckBox = findViewById(R.id.cb_terms)
        val btn_Register: Button = findViewById(R.id.btn_submit_register)
        val btn_BackToLogin: Button = findViewById(R.id.btn_back_to_login)
        val spinnerDomisili: Spinner = findViewById(R.id.spinner_domisili)

        btn_BackToLogin.setOnClickListener {
            finish()
        }

        btn_Register.setOnClickListener {
            val username = et_RegUsername.text.toString()
            val selectedGenderId = rgGender.checkedRadioButtonId
            val domisili = spinnerDomisili.selectedItem.toString()

            if (selectedGenderId == -1) {
                Toast.makeText(this, "Pilih jenis kelamin terlebih dahulu", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val selectedRadioButton: RadioButton = findViewById(selectedGenderId)
            val gender = selectedRadioButton.text.toString()
            val isAgreed = cbTerms.isChecked

            if (!isAgreed) {
                Toast.makeText(this, "Harap setujui syarat & ketentuan", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Toast.makeText(
                this,
                "Username: $username\nJenis Kelamin: $gender\nDomisili: $domisili\nSetuju: $isAgreed",
                Toast.LENGTH_LONG
            ).show()

            val pindah = Intent(this, HomeActivity::class.java)
            pindah.putExtra("nama", username)
            startActivity(pindah)
        }
    }
}
