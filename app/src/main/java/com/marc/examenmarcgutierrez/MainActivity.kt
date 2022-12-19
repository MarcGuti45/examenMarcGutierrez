package com.marc.examenmarcgutierrez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonEnter = findViewById<Button>(R.id.buttonEntrar)
        val editText = findViewById<EditText>(R.id.etAdmin)

        buttonEnter.setOnClickListener {
            if(editText.getText().toString() == "Marc"){
                val intent = Intent(this, PantallaUsuariNou::class.java)
                startActivity(intent)
            } else{
                Toast.makeText(this, "Nom d'admin incorrecte", Toast.LENGTH_SHORT).show()
            }

        }

    }
}