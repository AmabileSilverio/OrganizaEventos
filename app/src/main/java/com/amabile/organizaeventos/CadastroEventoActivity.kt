package com.amabile.organizaeventos

import android.widget.ArrayAdapter
import android.widget.ListView
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CadastroEventoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_evento)

        val edtNomeEvento = findViewById<EditText>(R.id.edtNomeEvento)
        val edtDataEvento = findViewById<EditText>(R.id.edtDataEvento)
        val edtHorarioEvento = findViewById<EditText>(R.id.edtHorarioEvento)
        val edtLocalEvento = findViewById<EditText>(R.id.edtLocalEvento)
        val edtDescricaoEvento = findViewById<EditText>(R.id.edtDescricaoEvento)
        val edtTipoEvento = findViewById<EditText>(R.id.edtTipoEvento)
        val edtQtdConvidados = findViewById<EditText>(R.id.edtQtdConvidados)
        val listViewPessoas =
            findViewById<ListView>(R.id.listViewPessoas)
        val listaNomesPessoas = mutableListOf<String>()

        for (pessoa in PessoaRepository.listaPessoas) {

            listaNomesPessoas.add(pessoa.nome)

        }

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_multiple_choice,
            listaNomesPessoas
        )

        listViewPessoas.adapter = adapter


        val btnSalvarEvento = findViewById<Button>(R.id.btnSalvarEvento)


        btnSalvarEvento.setOnClickListener {

            val evento = Evento(

                nome = edtNomeEvento.text.toString(),
                data = edtDataEvento.text.toString(),
                horario = edtHorarioEvento.text.toString(),
                local = edtLocalEvento.text.toString(),
                descricao = edtDescricaoEvento.text.toString(),
                tipo = edtTipoEvento.text.toString(),
                quantidadeConvidados = edtQtdConvidados.text.toString().toInt()

            )

            EventoRepository.listaEventos.add(evento)
            for (i in 0 until listViewPessoas.count) {

                if (listViewPessoas.isItemChecked(i)) {

                    val nomePessoa =
                        listaNomesPessoas[i]

                    val convidado = ConvidadoEvento(

                        nomeEvento = evento.nome,
                        nomePessoa = nomePessoa

                    )

                    ConvidadoRepository
                        .listaConvidados
                        .add(convidado)

                }
            }

            Toast.makeText(
                this,
                "Evento salvo com sucesso!",
                Toast.LENGTH_SHORT
            ).show()

        }
    }
}