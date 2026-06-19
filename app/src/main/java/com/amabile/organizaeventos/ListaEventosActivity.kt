package com.amabile.organizaeventos // Define o pacote ao qual esta classe pertence

import android.content.Intent // Importa a classe utilizada para navegar entre telas
import android.os.Bundle // Importa a classe Bundle utilizada no ciclo de vida da Activity
import android.widget.ArrayAdapter // Importa a classe utilizada para preencher listas
import android.widget.ListView // Importa o componente ListView
import androidx.appcompat.app.AppCompatActivity // Importa a classe base para Activities

class ListaEventosActivity : AppCompatActivity() { // Declara a tela de listagem de eventos

    override fun onCreate(savedInstanceState: Bundle?) { // Método executado quando a Activity é criada

        super.onCreate(savedInstanceState) // Executa o método da classe pai

        setContentView(R.layout.activity_lista_eventos) // Carrega o layout activity_lista_eventos.xml

        val listViewEventos =
            findViewById<ListView>(R.id.listViewEventos) // Localiza a ListView da tela
        val listaNomes = mutableListOf<String>() // Cria uma lista vazia para armazenar os eventos

        for (evento in EventoRepository.listaEventos) { // Percorre todos os eventos cadastrados

            listaNomes.add( // Adiciona um item na lista

                "${evento.nome} - ${evento.data}" // Junta o nome e a data do evento em uma única String

            )

        } // Finaliza o laço de repetição

        val adapter = ArrayAdapter( // Cria um adaptador para preencher a ListView

            this, // Define o contexto atual

            android.R.layout.simple_list_item_1, // Define o layout padrão de cada item da lista

            listaNomes // Define a lista que será exibida

        )

        listViewEventos.adapter = adapter // Associa o adaptador à ListView

        listViewEventos.setOnItemClickListener { _, _, position, _ -> // Define a ação ao clicar em um item da lista

            val eventoSelecionado =
                EventoRepository.listaEventos[position] // Obtém o evento selecionado pelo usuário

            val intent = Intent(
                this,
                DetalhesEventoActivity::class.java
            ) // Cria uma Intent para abrir a tela de detalhes

            intent.putExtra( // Adiciona uma informação à Intent

                "nomeEvento", // Chave utilizada para identificar o dado

                eventoSelecionado.nome // Valor enviado para a próxima tela

            )

            intent.putExtra( // Adiciona uma informação à Intent

                "dataEvento", // Chave utilizada para identificar o dado

                eventoSelecionado.data // Valor enviado para a próxima tela

            )

            intent.putExtra( // Adiciona uma informação à Intent

                "localEvento", // Chave utilizada para identificar o dado

                eventoSelecionado.local // Valor enviado para a próxima tela

            )

            startActivity(intent) // Abre a tela DetalhesEventoActivity

        } // Finaliza o evento de clique da lista

    } // Finaliza o método onCreate


} // Finaliza a classe ListaEventosActivity
