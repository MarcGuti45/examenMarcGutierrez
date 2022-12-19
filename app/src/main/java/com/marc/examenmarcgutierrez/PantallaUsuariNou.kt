package com.marc.examenmarcgutierrez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PantallaUsuariNou : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_usuari_nou)

        val buttonAfegir = findViewById<Button>(R.id.buttonAfegirAlumne)
        val buttonLlistat = findViewById<Button>(R.id.buttonLlistat)


        buttonAfegir.setOnClickListener{
            val intent = Intent(this, PantallaConfirmacio::class.java)
            startActivity(intent)
        }

        buttonLlistat.setOnClickListener{
            val intent = Intent(this, PantallaLListat::class.java)
            startActivity(intent)
        }
    }
}