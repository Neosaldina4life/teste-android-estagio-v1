package com.example.desafio.viewmodel

import androidx.lifecycle.ViewModel
import com.example.desafio.model.*

class MainViewModel : ViewModel() {
    val vehicles: List<Vehicle> = listOf()
    val stops: List<Stop> = listOf()
    val lines: List<Line> = listOf()
    val forecasts: List<Forecast> = listOf()
}