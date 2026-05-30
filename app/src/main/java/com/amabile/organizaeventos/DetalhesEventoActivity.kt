package com.amabile.organizaeventos

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalhesEventoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_evento)

        val txtNomeEvento =
            findViewById<TextView>(R.id.txtNomeEvento)

        val txtDataEvento =
            findViewById<TextView>(R.id.txtDataEvento)

        val txtLocalEvento =
            findViewById<TextView>(R.id.txtLocalEvento)

        val listViewConvidados =
            findViewById<ListView>(R.id.listViewConvidadosEvento)

        val nomeEvento =
            intent.getStringExtra("nomeEvento")
        val dataEvento =
            intent.getStringExtra("dataEvento")

        val localEvento =
            intent.getStringExtra("localEvento")

        txtNomeEvento.text = nomeEvento
        txtDataEvento.text = "Data: $dataEvento"
        txtLocalEvento.text = "Local: $localEvento"

        val convidadosEvento = mutableListOf<String>()

        for (convidado in ConvidadoRepository.listaConvidados) {

            if (convidado.nomeEvento == nomeEvento) {

                convidadosEvento.add(convidado.nomePessoa)

            }
        }

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            convidadosEvento
        )

        listViewConvidados.adapter = adapter
    }
}