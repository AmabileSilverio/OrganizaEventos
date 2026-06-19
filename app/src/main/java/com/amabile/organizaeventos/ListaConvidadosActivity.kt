package com.amabile.organizaeventos // Define o pacote ao qual esta classe pertence

import android.os.Bundle // Importa a classe Bundle utilizada no ciclo de vida da Activity
import android.widget.ArrayAdapter // Importa a classe utilizada para preencher listas
import android.widget.ListView // Importa o componente ListView
import androidx.appcompat.app.AppCompatActivity // Importa a classe base para Activities

class ListaConvidadosActivity : AppCompatActivity() { // Declara a tela de listagem de convidados


    override fun onCreate(savedInstanceState: Bundle?) { // Método executado quando a Activity é criada

        super.onCreate(savedInstanceState) // Executa o método da classe pai

        setContentView(R.layout.activity_lista_convidados) // Carrega o layout activity_lista_convidados.xml

        val listViewConvidados =
            findViewById<ListView>(R.id.listViewConvidados) // Localiza a ListView da tela
        val listaNomes =
            mutableListOf<String>() // Cria uma lista vazia para armazenar os convidados
        for (convidado in ConvidadoRepository.listaConvidados) { // Percorre todos os convidados cadastrados

            listaNomes.add( // Adiciona um item na lista

                "${convidado.nomeEvento} - ${convidado.nomePessoa}" // Junta o nome do evento e o nome do convidado em uma única String

            )

        } // Finaliza o laço de repetição

        val adapter = ArrayAdapter( // Cria um adaptador para preencher a ListView

            this, // Define o contexto atual

            android.R.layout.simple_list_item_1, // Define o layout padrão de cada item da lista

            listaNomes // Define a lista que será exibida

        )

        listViewConvidados.adapter = adapter // Associa o adaptador à ListView

    } // Finaliza o método onCreate


} // Finaliza a classe ListaConvidadosActivity
