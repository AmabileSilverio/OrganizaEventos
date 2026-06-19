package com.amabile.organizaeventos // Define o pacote ao qual esta classe pertence

import android.os.Bundle // Importa a classe Bundle utilizada no ciclo de vida da Activity
import android.widget.Button // Importa o componente Button
import android.widget.EditText // Importa o componente EditText
import android.widget.Toast // Importa a classe utilizada para exibir mensagens rápidas
import androidx.appcompat.app.AppCompatActivity // Importa a classe base para Activities

class ConvidadosActivity : AppCompatActivity() { // Declara a tela de cadastro de convidados


    override fun onCreate(savedInstanceState: Bundle?) { // Método executado quando a Activity é criada

        super.onCreate(savedInstanceState) // Executa o método da classe pai

        setContentView(R.layout.activity_convidados) // Carrega o layout activity_convidados.xml

        val edtNomeEvento =
            findViewById<EditText>(R.id.edtNomeEventoConvidado) // Localiza o campo nome do evento
        val edtNomePessoa =
            findViewById<EditText>(R.id.edtNomePessoaConvidado) // Localiza o campo nome da pessoa
        val btnAdicionarConvidado =
            findViewById<Button>(R.id.btnAdicionarConvidado) // Localiza o botão adicionar convidado

        btnAdicionarConvidado.setOnClickListener { // Define a ação ao clicar no botão

            val convidado = ConvidadoEvento( // Cria um objeto da classe ConvidadoEvento

                nomeEvento = edtNomeEvento.text.toString(), // Obtém o nome do evento digitado

                nomePessoa = edtNomePessoa.text.toString() // Obtém o nome da pessoa digitado

            ) // Finaliza a criação do objeto ConvidadoEvento

            ConvidadoRepository.listaConvidados.add(convidado) // Adiciona o convidado à lista de convidados cadastrados

            Toast.makeText( // Cria uma mensagem de confirmação

                this, // Define o contexto atual da Activity

                "Convidado adicionado!", // Texto exibido ao usuário

                Toast.LENGTH_SHORT // Define o tempo de exibição da mensagem

            ).show() // Exibe a mensagem na tela

        } // Finaliza o evento de clique do botão

    } // Finaliza o método onCreate


} // Finaliza a classe ConvidadosActivity
