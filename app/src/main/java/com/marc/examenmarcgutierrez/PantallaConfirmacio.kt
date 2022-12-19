package com.marc.examenmarcgutierrez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PantallaConfirmacio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_confirmacio)

        val buttonYes = findViewById<Button>(R.id.buttonYes)
        val buttonNo = findViewById<Button>(R.id.buttonNo)

        buttonYes.setOnClickListener {
            val intent = Intent(this, PantallaLListat::class.java)
            startActivity(intent)
        }

        buttonNo.setOnClickListener {
            val intent = Intent(this, PantallaUsuariNou::class.java)
            startActivity(intent)
        }
    }
}