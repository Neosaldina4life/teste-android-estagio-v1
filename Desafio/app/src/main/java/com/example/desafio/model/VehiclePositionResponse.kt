package com.example.desafio.model

data class Vehicle(val id: String, val latitude: Double, val longitude: Double)
data class VehiclePositionsResponse(val vehicles: List<Vehicle>)