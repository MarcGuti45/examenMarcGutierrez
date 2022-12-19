package com.marc.examenmarcgutierrez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class AlumneDetallActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alumne_detall)

        val buttonSortir = findViewById<ImageButton>(R.id.imageButton)

        buttonSortir.setOnClickListener{
            val intent = Intent(this, PantallaUsuariNou::class.java)
            startActivity(intent)
        }
    }
}