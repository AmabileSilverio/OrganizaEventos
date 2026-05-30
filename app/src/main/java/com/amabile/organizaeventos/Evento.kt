package com.amabile.organizaeventos

data class Evento(

    val nome: String,
    val data: String,
    val horario: String,
    val local: String,
    val descricao: String,
    val tipo: String,
    val quantidadeConvidados: Int

)