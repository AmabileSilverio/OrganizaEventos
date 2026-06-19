package com.amabile.organizaeventos // Define o pacote ao qual esta classe pertence

import android.content.Intent // Importa a classe utilizada para navegar entre telas
import android.os.Bundle // Importa a classe Bundle utilizada no ciclo de vida da Activity
import android.widget.Button // Importa o componente Button
import androidx.appcompat.app.AppCompatActivity // Importa a classe base para Activities

class MainActivity : AppCompatActivity() { // Declara a tela principal do aplicativo


    override fun onCreate(savedInstanceState: Bundle?) { // Método executado quando a Activity é criada

        super.onCreate(savedInstanceState) // Executa o método da classe pai

        setContentView(R.layout.activity_main) // Carrega o layout activity_main.xml

        val btnEventos = findViewById<Button>(R.id.btnEventos) // Localiza o botão Eventos
        val btnPessoas = findViewById<Button>(R.id.btnPessoas) // Localiza o botão Pessoas

        btnEventos.setOnClickListener { // Define a ação ao clicar no botão Eventos

            val intent = Intent(
                this,
                EventosActivity::class.java
            ) // Cria uma Intent para abrir a tela de eventos

            startActivity(intent) // Abre a tela EventosActivity

        } // Finaliza o evento de clique do botão Eventos

        btnPessoas.setOnClickListener { // Define a ação ao clicar no botão Pessoas

            val intent = Intent(
                this,
                CadastroPessoaActivity::class.java
            ) // Cria uma Intent para abrir a tela de cadastro de pessoas

            startActivity(intent) // Abre a tela CadastroPessoaActivity

        } // Finaliza o evento de clique do botão Pessoas

    } // Finaliza o método onCreate


} // Finaliza a classe MainActivity
