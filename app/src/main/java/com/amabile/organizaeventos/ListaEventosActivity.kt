package com.amabile.organizaeventos

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ListaEventosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_eventos)

        val listViewEventos = findViewById<ListView>(R.id.listViewEventos)

        val listaNomes = mutableListOf<String>()

        for (evento in EventoRepository.listaEventos) {

            listaNomes.add(
                "${evento.nome} - ${evento.data}"
            )

        }

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            listaNomes
        )

        listViewEventos.adapter = adapter
        listViewEventos.setOnItemClickListener { _, _, position, _ ->

            val eventoSelecionado =
                EventoRepository.listaEventos[position]

            val intent =
                Intent(this, DetalhesEventoActivity::class.java)

            intent.putExtra(
                "nomeEvento",
                eventoSelecionado.nome
            )

            intent.putExtra(
                "dataEvento",
                eventoSelecionado.data
            )

            intent.putExtra(
                "localEvento",
                eventoSelecionado.local
            )
            startActivity(intent)

        }
    }
}