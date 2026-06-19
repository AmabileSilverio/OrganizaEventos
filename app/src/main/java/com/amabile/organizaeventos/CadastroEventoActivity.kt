package com.amabile.organizaeventos // Define o pacote ao qual esta classe pertence

import android.widget.ArrayAdapter // Importa a classe utilizada para preencher listas
import android.widget.ListView // Importa o componente de lista
import android.os.Bundle // Importa a classe Bundle para armazenar dados da Activity
import android.widget.Button // Importa o componente Button
import android.widget.EditText // Importa o componente EditText
import android.widget.Toast // Importa a classe utilizada para exibir mensagens rápidas
import androidx.appcompat.app.AppCompatActivity // Importa a classe base para Activities

class CadastroEventoActivity : AppCompatActivity() { // Declara a tela de cadastro de eventos


    override fun onCreate(savedInstanceState: Bundle?) { // Método executado quando a tela é criada

        super.onCreate(savedInstanceState) // Chama o método da classe pai

        setContentView(R.layout.activity_cadastro_evento) // Define o layout que será exibido

        val edtNomeEvento =
            findViewById<EditText>(R.id.edtNomeEvento) // Obtém referência ao campo nome do evento
        val edtDataEvento =
            findViewById<EditText>(R.id.edtDataEvento) // Obtém referência ao campo data do evento
        val edtHorarioEvento =
            findViewById<EditText>(R.id.edtHorarioEvento) // Obtém referência ao campo horário do evento
        val edtLocalEvento =
            findViewById<EditText>(R.id.edtLocalEvento) // Obtém referência ao campo local do evento
        val edtDescricaoEvento =
            findViewById<EditText>(R.id.edtDescricaoEvento) // Obtém referência ao campo descrição do evento
        val edtTipoEvento =
            findViewById<EditText>(R.id.edtTipoEvento) // Obtém referência ao campo tipo do evento
        val edtQtdConvidados =
            findViewById<EditText>(R.id.edtQtdConvidados) // Obtém referência ao campo quantidade de convidados
        val listViewPessoas =
            findViewById<ListView>(R.id.listViewPessoas) // Obtém referência à lista de pessoas
        val listaNomesPessoas =
            mutableListOf<String>() // Cria uma lista vazia para armazenar os nomes das pessoas

        for (pessoa in PessoaRepository.listaPessoas) { // Percorre todas as pessoas cadastradas

            listaNomesPessoas.add(pessoa.nome) // Adiciona o nome da pessoa na lista

        }

        val adapter = ArrayAdapter( // Cria um adaptador para exibir os nomes na lista

            this, // Define o contexto atual

            android.R.layout.simple_list_item_multiple_choice, // Define o layout com múltipla seleção

            listaNomesPessoas // Define a lista de nomes que será exibida

        )

        listViewPessoas.adapter = adapter // Associa o adaptador à ListView

        val btnSalvarEvento =
            findViewById<Button>(R.id.btnSalvarEvento) // Obtém referência ao botão salvar

        btnSalvarEvento.setOnClickListener { // Define ação ao clicar no botão

            val evento = Evento( // Cria um novo objeto Evento

                nome = edtNomeEvento.text.toString(), // Obtém o nome digitado

                data = edtDataEvento.text.toString(), // Obtém a data digitada

                horario = edtHorarioEvento.text.toString(), // Obtém o horário digitado

                local = edtLocalEvento.text.toString(), // Obtém o local digitado

                descricao = edtDescricaoEvento.text.toString(), // Obtém a descrição digitada

                tipo = edtTipoEvento.text.toString(), // Obtém o tipo digitado

                quantidadeConvidados = edtQtdConvidados.text.toString()
                    .toInt() // Converte a quantidade para número inteiro

            )

            EventoRepository.listaEventos.add(evento) // Salva o evento na lista de eventos

            for (i in 0 until listViewPessoas.count) { // Percorre todos os itens da lista

                if (listViewPessoas.isItemChecked(i)) { // Verifica se o item foi selecionado

                    val nomePessoa =
                        listaNomesPessoas[i] // Obtém o nome da pessoa selecionada

                    val convidado = ConvidadoEvento( // Cria um objeto convidado

                        nomeEvento = evento.nome, // Associa o nome do evento

                        nomePessoa = nomePessoa // Associa o nome da pessoa

                    )

                    ConvidadoRepository // Acessa o repositório de convidados
                        .listaConvidados // Acessa a lista de convidados
                        .add(convidado) // Adiciona o convidado na lista

                }
            }

            Toast.makeText( // Cria uma mensagem para o usuário

                this, // Contexto atual

                "Evento salvo com sucesso!", // Texto exibido

                Toast.LENGTH_SHORT // Tempo de exibição da mensagem

            ).show() // Exibe a mensagem na tela

        }
    }


}
