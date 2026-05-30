package com.amabile.organizaeventos

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CadastroPessoaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_pessoa)

        val edtNomePessoa = findViewById<EditText>(R.id.edtNomePessoa)
        val edtTelefonePessoa = findViewById<EditText>(R.id.edtTelefonePessoa)
        val edtEmailPessoa = findViewById<EditText>(R.id.edtEmailPessoa)

        val btnSalvarPessoa = findViewById<Button>(R.id.btnSalvarPessoa)

        btnSalvarPessoa.setOnClickListener {

            val pessoa = Pessoa(

                nome = edtNomePessoa.text.toString(),
                telefone = edtTelefonePessoa.text.toString(),
                email = edtEmailPessoa.text.toString()

            )

            PessoaRepository.listaPessoas.add(pessoa)

            Toast.makeText(
                this,
                "Pessoa salva com sucesso!",
                Toast.LENGTH_SHORT
            ).show()

        }
    }
}