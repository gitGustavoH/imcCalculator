package com.gustavohenrique.projetocalculoimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnCalcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular = findViewById(R.id.btnCalcular)

        btnCalcular.setOnClickListener {
            val i = Intent(this, ResultadoActivity::class.java)

            startActivity(i)
        }
    }
}