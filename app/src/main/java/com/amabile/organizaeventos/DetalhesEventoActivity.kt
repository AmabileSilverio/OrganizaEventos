package com.amabile.organizaeventos // Define o pacote ao qual esta classe pertence

import android.os.Bundle // Importa a classe Bundle utilizada no ciclo de vida da Activity
import android.widget.ArrayAdapter // Importa a classe utilizada para preencher listas
import android.widget.ListView // Importa o componente ListView
import android.widget.TextView // Importa o componente TextView
import androidx.appcompat.app.AppCompatActivity // Importa a classe base para Activities

class DetalhesEventoActivity : AppCompatActivity() { // Declara a tela de detalhes do evento


    override fun onCreate(savedInstanceState: Bundle?) { // Método executado quando a tela é criada

        super.onCreate(savedInstanceState) // Executa o método da classe pai

        setContentView(R.layout.activity_detalhes_evento) // Carrega o layout activity_detalhes_evento.xml

        val txtNomeEvento =
            findViewById<TextView>(R.id.txtNomeEvento) // Localiza o campo que exibirá o nome do evento
        val txtDataEvento =
            findViewById<TextView>(R.id.txtDataEvento) // Localiza o campo que exibirá a data do evento
        val txtLocalEvento =
            findViewById<TextView>(R.id.txtLocalEvento) // Localiza o campo que exibirá o local do evento
        val listViewConvidados =
            findViewById<ListView>(R.id.listViewConvidadosEvento) // Localiza a lista de convidados
        val nomeEvento =
            intent.getStringExtra("nomeEvento") // Recebe o nome do evento enviado pela tela anterior
        val dataEvento =
            intent.getStringExtra("dataEvento") // Recebe a data do evento enviada pela tela anterior
        val localEvento =
            intent.getStringExtra("localEvento") // Recebe o local do evento enviado pela tela anterior

        txtNomeEvento.text = nomeEvento // Exibe o nome do evento na tela

        txtDataEvento.text = "Data: $dataEvento" // Exibe a data do evento na tela

        txtLocalEvento.text = "Local: $localEvento" // Exibe o local do evento na tela

        val convidadosEvento =
            mutableListOf<String>() // Cria uma lista para armazenar os convidados do evento

        for (convidado in ConvidadoRepository.listaConvidados) { // Percorre todos os convidados cadastrados

            if (convidado.nomeEvento == nomeEvento) { // Verifica se o convidado pertence ao evento selecionado

                convidadosEvento.add(convidado.nomePessoa) // Adiciona o nome do convidado na lista

            }
        }

        val adapter = ArrayAdapter( // Cria um adaptador para preencher a ListView

            this, // Define o contexto atual

            android.R.layout.simple_list_item_1, // Define o layout padrão de cada item da lista

            convidadosEvento // Define a lista de convidados que será exibida

        )

        listViewConvidados.adapter = adapter // Associa o adaptador à ListView

    } // Finaliza o método onCreate


} // Finaliza a classe DetalhesEventoActivity
