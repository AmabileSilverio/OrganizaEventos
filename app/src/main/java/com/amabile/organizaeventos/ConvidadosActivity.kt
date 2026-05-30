package com.amabile.organizaeventos

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ConvidadosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_convidados)

        val edtNomeEvento = findViewById<EditText>(R.id.edtNomeEventoConvidado)
        val edtNomePessoa = findViewById<EditText>(R.id.edtNomePessoaConvidado)

        val btnAdicionarConvidado =
            findViewById<Button>(R.id.btnAdicionarConvidado)

        btnAdicionarConvidado.setOnClickListener {

            val convidado = ConvidadoEvento(

                nomeEvento = edtNomeEvento.text.toString(),
                nomePessoa = edtNomePessoa.text.toString()

            )

            ConvidadoRepository.listaConvidados.add(convidado)

            Toast.makeText(
                this,
                "Convidado adicionado!",
                Toast.LENGTH_SHORT
            ).show()

        }
    }
}