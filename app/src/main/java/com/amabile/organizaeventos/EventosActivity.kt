package com.amabile.organizaeventos // Define o pacote ao qual esta classe pertence

import android.content.Intent // Importa a classe utilizada para navegar entre telas
import android.os.Bundle // Importa a classe Bundle utilizada no ciclo de vida da Activity
import android.widget.Button // Importa o componente Button
import androidx.appcompat.app.AppCompatActivity // Importa a classe base para Activities

class EventosActivity : AppCompatActivity() { // Declara a tela de gerenciamento de eventos


    override fun onCreate(savedInstanceState: Bundle?) { // Método executado quando a Activity é criada

        super.onCreate(savedInstanceState) // Executa o método da classe pai

        setContentView(R.layout.activity_eventos) // Carrega o layout activity_eventos.xml

        val btnNovoEvento =
            findViewById<Button>(R.id.btnNovoEvento) // Localiza o botão de cadastrar novo evento
        val btnVerEventos =
            findViewById<Button>(R.id.btnVerEventos) // Localiza o botão de visualizar eventos

        btnNovoEvento.setOnClickListener { // Define a ação ao clicar no botão Novo Evento

            val intent = Intent(
                this,
                CadastroEventoActivity::class.java
            ) // Cria uma Intent para abrir a tela de cadastro de eventos

            startActivity(intent) // Abre a tela CadastroEventoActivity

        } // Finaliza o evento de clique do botão Novo Evento

        btnVerEventos.setOnClickListener { // Define a ação ao clicar no botão Ver Eventos

            val intent = Intent(
                this,
                ListaEventosActivity::class.java
            ) // Cria uma Intent para abrir a tela de listagem de eventos

            startActivity(intent) // Abre a tela ListaEventosActivity

        } // Finaliza o evento de clique do botão Ver Eventos

    } // Finaliza o método onCreate


} // Finaliza a classe EventosActivity
