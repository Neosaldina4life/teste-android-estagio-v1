package com.example.desafio.model

data class Forecast(val stopCode: String, val vehicleId: String, val arrivalTime: String)
data class ArrivalForecastResponse(val forecasts: List<Forecast>)