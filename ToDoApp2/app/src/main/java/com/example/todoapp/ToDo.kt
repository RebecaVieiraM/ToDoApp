package com.example.todoapp

import java.time.Instant
import java.util.Date

data class ToDo(
    var id: Int,
    var titulo: String,
    var criadoEm: Date
)

fun getMockToDo(): List<ToDo> {
    return listOf<ToDo>(
        ToDo(1, "Primeiro Item", Date.from(Instant.now())),
        ToDo(2, "Segundo Item", Date.from(Instant.now())),
        ToDo(3, "Terceiro Item", Date.from(Instant.now())),
        ToDo(4, "Quarto Item", Date.from(Instant.now())),

        )
}
// 7- colocar as variaveis dentro da classe, (dar enter em Date)
// 8- criar a funcao  getMockToDo() e seu return