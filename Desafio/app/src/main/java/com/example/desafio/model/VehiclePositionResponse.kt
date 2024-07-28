package com.example.desafio.model

data class VehiclePositionsResponse(
    val l: List<Line>
)

data class Line(
    val cl: Int,
    val lc: Boolean,
    val lt0: String,
    val lt1: String,
    val qv: Int,
    val vs: List<Vehicle>
)

data class Vehicle(
    val p: String,
    val a: Boolean,
    val ta: String,
    val py: Double,
    val px: Double
)