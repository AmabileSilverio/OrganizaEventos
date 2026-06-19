# 📅 OrganizaEventos

## 📖 Sobre o Projeto

O OrganizaEventos é um aplicativo Android desenvolvido em Kotlin com o objetivo de auxiliar no gerenciamento de eventos, pessoas e convidados.

O sistema permite cadastrar pessoas, criar eventos, associar convidados aos eventos e visualizar informações detalhadas de cada evento de forma simples e organizada.

---

## 🚀 Funcionalidades

- Cadastro de pessoas
- Cadastro de eventos
- Associação de convidados aos eventos
- Visualização da lista de eventos
- Visualização dos detalhes de cada evento
- Visualização da lista de convidados

---

## 🛠 Tecnologias Utilizadas

- Kotlin
- Android Studio
- XML
- Android SDK

---

## 📂 Estrutura do Projeto

### Interfaces (XML)

#### activity_main.xml
Tela inicial do aplicativo.

Responsável por:
- Acessar o módulo de eventos
- Acessar o módulo de pessoas

#### activity_eventos.xml
Tela principal do módulo de eventos.

Responsável por:
- Cadastrar eventos
- Visualizar eventos cadastrados

#### activity_cadastro_evento.xml
Tela de cadastro de eventos.

Permite informar:
- Nome
- Data
- Horário
- Local
- Descrição
- Tipo
- Quantidade de convidados

#### activity_cadastro_pessoa.xml
Tela de cadastro de pessoas.

Permite informar:
- Nome
- Telefone
- E-mail

#### activity_convidados.xml
Tela utilizada para associar convidados a eventos.

#### activity_lista_eventos.xml
Exibe todos os eventos cadastrados.

#### activity_detalhes_evento.xml
Exibe:
- Nome do evento
- Data
- Local
- Lista de convidados

#### activity_lista_convidados.xml
Exibe todos os convidados cadastrados.

---

## 💻 Classes Kotlin

### MainActivity.kt
Tela inicial responsável pela navegação principal do sistema.

### EventosActivity.kt
Gerencia o módulo de eventos.

### CadastroEventoActivity.kt
Responsável pelo cadastro de novos eventos.

### CadastroPessoaActivity.kt
Responsável pelo cadastro de pessoas.

### ConvidadosActivity.kt
Responsável pela associação de convidados aos eventos.

### ListaEventosActivity.kt
Exibe os eventos cadastrados.

### DetalhesEventoActivity.kt
Exibe os detalhes completos de um evento.

### ListaConvidadosActivity.kt
Exibe todos os convidados cadastrados.

---

## 📦 Modelos de Dados

### Pessoa.kt

Representa uma pessoa cadastrada.

Atributos:
- Nome
- Telefone
- E-mail

### Evento.kt

Representa um evento.

Atributos:
- Nome
- Data
- Horário
- Local
- Descrição
- Tipo
- Quantidade de convidados

### ConvidadoEvento.kt

Representa a associação entre um evento e uma pessoa.

Atributos:
- Nome do evento
- Nome da pessoa

---

## 🗄 Repositórios

### PessoaRepository.kt
Armazena as pessoas cadastradas.

### EventoRepository.kt
Armazena os eventos cadastrados.

### ConvidadoRepository.kt
Armazena os convidados cadastrados.

---

## 🔄 Fluxo do Sistema

1. O usuário acessa a tela principal.
2. Realiza o cadastro de pessoas.
3. Cria um evento.
4. Seleciona convidados.
5. Salva o evento.
6. Visualiza os eventos cadastrados.
7. Consulta os detalhes dos eventos e convidados.

---

## 👩‍💻 Desenvolvido por

Amábile Silvério

Projeto acadêmico desenvolvido para a disciplina de Desenvolvimento Mobile.
