package com.example.testiingg

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var edt1: EditText
    lateinit var edt2: EditText
    lateinit var edt3: EditText
    lateinit var btn: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        edt1 = findViewById(R.id.edt1)
        edt2 = findViewById(R.id.edt2)
        edt3 = findViewById(R.id.edt3)
        btn = findViewById(R.id.btn)


        btn.setOnClickListener {
            var name = edt1.text.toString()
            var email = edt2.text.toString()
            var phone = edt3.text.toString()

            if (name.isEmpty() && email.isEmpty() && phone.isEmpty()) {
                edt1.error = "Please Enter Name"
                edt2.error = "Please Enter Email"
                edt3.error = "Please Enter Phone Number"


            } else if (name.isEmpty()) {
                edt1.error = "Please Enter Name"

            } else if (email.isEmpty()) {
                edt2.error = "Please Enter Email"
            }
            else if (email.isEmpty()) {
                edt3.error = "Please Enter Phone Number"
            }

            else if (name == "utsav" && email == "utsavzalavadiya21@gmail.com" && phone == "9558114662") {
                Toast.makeText(applicationContext, "Successful Login", Toast.LENGTH_SHORT).show()
            } else {

                Toast.makeText(applicationContext, "Invalid Credentials", Toast.LENGTH_SHORT).show()
            }
        }
    }
}