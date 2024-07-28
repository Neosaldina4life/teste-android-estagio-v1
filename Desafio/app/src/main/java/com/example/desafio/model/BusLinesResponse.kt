package com.example.desafio.model

data class Line(val code: String, val name: String)
data class BusLinesResponse(val lines: List<Line>)