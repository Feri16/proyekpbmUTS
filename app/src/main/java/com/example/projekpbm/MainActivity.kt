package com.example.projekpbm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnwisata: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnwisata = findViewById(R.id.btn_wisata)

        btnwisata.setOnClickListener {
            val asu = Intent(this, wisata::class.java)
            startActivity(asu)
        }



    }
}
