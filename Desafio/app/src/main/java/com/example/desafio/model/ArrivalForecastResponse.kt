package com.example.desafio.model

data class ArrivalForecastResponse(
    val p: List<StopForecast>
)

data class StopForecast(
    val cp: Int,
    val np: String,
    val l: List<LineForecast>
)

data class LineForecast(
    val cl: Int,
    val lt0: String,
    val lt1: String,
    val sl: Int,
    val tl: Int,
    val vs: List<VehicleForecast>
)

data class VehicleForecast(
    val p: String,
    val t: String,
    val a: Boolean,
    val ta: String,
    val py: Double,
    val px: Double
)