package com.marc.examenmarcgutierrez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonEnter = findViewById<Button>(R.id.buttonEntrar)

        buttonEnter.setOnClickListener {
            val intent = Intent(this, PantallaUsuariNou::class.java)
            startActivity(intent)
        }

    }
}