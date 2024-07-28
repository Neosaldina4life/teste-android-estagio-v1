package com.example.desafio.model

data class BusLinesResponse(
    val linhas: List<BusLine>
)

data class BusLine(
    val cl: Int,
    val lc: Boolean,
    val lt0: String,
    val lt1: String,
    val sl: Int,
    val tl: Int
)