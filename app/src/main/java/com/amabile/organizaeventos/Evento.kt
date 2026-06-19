package com.amabile.organizaeventos // Define o pacote ao qual esta classe pertence

data class Evento( // Declara uma classe de dados chamada Evento

    val nome: String, // Armazena o nome do evento
    val data: String, // Armazena a data em que o evento será realizado
    val horario: String, // Armazena o horário do evento
    val local: String, // Armazena o local onde o evento acontecerá
    val descricao: String, // Armazena a descrição do evento
    val tipo: String, // Armazena o tipo ou categoria do evento
    val quantidadeConvidados: Int // Armazena a quantidade máxima de convidados permitidos

) // Finaliza a classe Evento
