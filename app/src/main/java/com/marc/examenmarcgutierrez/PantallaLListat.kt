package com.marc.examenmarcgutierrez

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity

class PantallaLListat : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_llistat)

        var miLista = findViewById<ListView>(R.id.lvAlumnes) as ListView

        val arrayAdapter: ArrayAdapter<*>
        val alumnes = arrayOf(
            "Marc Gutiérrez", "Didac Gros", "Joan García",
            "Esteban Arquillo", "Alex Arredondo"
        )

        // access the listView from xml file
        var mListView = findViewById<ListView>(R.id.lvAlumnes)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, alumnes)
        mListView.adapter = arrayAdapter

        miLista.setOnItemClickListener(AdapterView.OnItemClickListener { parent, view, position, id ->

            val intent = Intent(this, AlumneDetallActivity::class.java)
            startActivity(intent)

        })


    }
}

