package com.example.desafio.model

data class BusStopsResponse(
    val ps: List<BusStop>
)

data class BusStop(
    val cp: Int,
    val np: String,
    val px: Double,
    val py: Double
)
