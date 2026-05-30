package com.amabile.organizaeventos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEventos =
            findViewById<Button>(R.id.btnEventos)

        val btnPessoas =
            findViewById<Button>(R.id.btnPessoas)

        btnEventos.setOnClickListener {

            val intent =
                Intent(this, EventosActivity::class.java)

            startActivity(intent)

        }

        btnPessoas.setOnClickListener {

            val intent =
                Intent(this, CadastroPessoaActivity::class.java)

            startActivity(intent)

        }
    }
}