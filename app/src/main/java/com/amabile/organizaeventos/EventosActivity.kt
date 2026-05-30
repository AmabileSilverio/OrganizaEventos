package com.amabile.organizaeventos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EventosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eventos)

        val btnNovoEvento =
            findViewById<Button>(R.id.btnNovoEvento)

        val btnVerEventos =
            findViewById<Button>(R.id.btnVerEventos)


        btnNovoEvento.setOnClickListener {

            val intent =
                Intent(this, CadastroEventoActivity::class.java)

            startActivity(intent)

        }

        btnVerEventos.setOnClickListener {

            val intent =
                Intent(this, ListaEventosActivity::class.java)

            startActivity(intent)

        }

    }
}