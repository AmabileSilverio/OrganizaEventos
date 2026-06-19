package com.amabile.organizaeventos // Define o pacote ao qual esta classe pertence

import android.os.Bundle // Importa a classe Bundle utilizada no ciclo de vida da Activity
import android.widget.Button // Importa o componente Button
import android.widget.EditText // Importa o componente EditText
import android.widget.Toast // Importa a classe utilizada para exibir mensagens na tela
import androidx.appcompat.app.AppCompatActivity // Importa a classe base para Activities

class CadastroPessoaActivity :
    AppCompatActivity() { // Declara a classe da tela de cadastro de pessoas


    override fun onCreate(savedInstanceState: Bundle?) { // Método executado quando a Activity é criada

        super.onCreate(savedInstanceState) // Executa o método da classe pai

        setContentView(R.layout.activity_cadastro_pessoa) // Carrega o layout activity_cadastro_pessoa.xml

        val edtNomePessoa =
            findViewById<EditText>(R.id.edtNomePessoa) // Localiza o campo nome na tela
        val edtTelefonePessoa =
            findViewById<EditText>(R.id.edtTelefonePessoa) // Localiza o campo telefone na tela
        val edtEmailPessoa =
            findViewById<EditText>(R.id.edtEmailPessoa) // Localiza o campo e-mail na tela
        val btnSalvarPessoa = findViewById<Button>(R.id.btnSalvarPessoa) // Localiza o botão salvar

        btnSalvarPessoa.setOnClickListener { // Define a ação executada ao clicar no botão

            val pessoa = Pessoa( // Cria um objeto da classe Pessoa

                nome = edtNomePessoa.text.toString(), // Obtém o texto digitado no campo nome

                telefone = edtTelefonePessoa.text.toString(), // Obtém o texto digitado no campo telefone

                email = edtEmailPessoa.text.toString() // Obtém o texto digitado no campo e-mail

            ) // Finaliza a criação do objeto Pessoa

            PessoaRepository.listaPessoas.add(pessoa) // Adiciona a pessoa na lista de pessoas cadastradas

            Toast.makeText( // Cria uma mensagem de confirmação

                this, // Define o contexto atual da Activity

                "Pessoa salva com sucesso!", // Texto exibido para o usuário

                Toast.LENGTH_SHORT // Define que a mensagem será exibida por pouco tempo

            ).show() // Exibe a mensagem na tela

        } // Finaliza o evento de clique do botão

    } // Finaliza o método onCreate


} // Finaliza a classe CadastroPessoaActivity
