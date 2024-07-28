package com.example.desafio.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.desafio.model.*
import com.example.desafio.network.ApiClient
import com.example.desafio.network.ApiService
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel : ViewModel() {
    private val _vehiclePositions = MutableStateFlow<List<Vehicle>>(emptyList())
    val vehiclePositions: StateFlow<List<Vehicle>> get() = _vehiclePositions

    private val _busStops = MutableStateFlow<List<BusStop>>(emptyList())
    val busStops: StateFlow<List<BusStop>> get() = _busStops

    private val _busLines = MutableStateFlow<List<BusLine>>(emptyList())
    val busLines: StateFlow<List<BusLine>> get() = _busLines

    private val _arrivalForecast = MutableStateFlow<List<StopForecast>>(emptyList())
    val arrivalForecast: StateFlow<List<StopForecast>> get() = _arrivalForecast

    init {
        fetchVehiclePositions()
        fetchBusStops()
        fetchBusLines()
    }

    private fun fetchVehiclePositions() {
        viewModelScope.launch {
            val response = ApiClient.service.getVehiclePositions()
            _vehiclePositions.value = response.l.flatMap { it.vs }
        }
    }

    private fun fetchBusStops() {
        viewModelScope.launch {
            val response = ApiClient.service.getBusStops()
            _busStops.value = response.ps
        }
    }

    private fun fetchBusLines() {
        viewModelScope.launch {
            val response = ApiClient.service.getBusLines()
            _busLines.value = response.linhas
        }
    }

    fun fetchArrivalForecast(stopCode: Int) {
        viewModelScope.launch {
            val response = ApiService.getArrivalForecast(stopCode)
            _arrivalForecast.value = response.p
        }
    }
}
