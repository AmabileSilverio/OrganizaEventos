package com.amabile.organizaeventos

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ListaConvidadosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_convidados)

        val listViewConvidados =
            findViewById<ListView>(R.id.listViewConvidados)

        val listaNomes = mutableListOf<String>()

        for (convidado in ConvidadoRepository.listaConvidados) {

            listaNomes.add(
                "${convidado.nomeEvento} - ${convidado.nomePessoa}"
            )

        }

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            listaNomes
        )

        listViewConvidados.adapter = adapter
    }
}