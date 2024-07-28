package com.example.desafio.model

data class Stop(val code: String, val name: String)
data class BusStopsResponse(val stops: List<Stop>)
