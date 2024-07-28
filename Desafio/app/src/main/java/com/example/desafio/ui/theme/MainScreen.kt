package com.example.desafio.ui.theme

import androidx.compose.runtime.Composable
import com.example.desafio.ui.theme.components.BusLinesComponent
import com.example.desafio.ui.theme.components.ArrivalForecastComponent
import com.example.desafio.ui.theme.components.BusStopsComponent
import com.example.desafio.ui.theme.components.VehiclePositionsComponent
import com.example.desafio.viewmodel.MainViewModel

@Composable
fun MainScreen(viewModel: MainViewModel = MainViewModel()) {
    val vehicles = viewModel.vehicles
    val stops = viewModel.stops
    val lines = viewModel.lines
    val forecasts = viewModel.forecasts

    VehiclePositionsComponent(vehicles = vehicles)
    BusStopsComponent(stops = stops)
    BusLinesComponent(lines = lines)
    ArrivalForecastComponent(forecasts = forecasts)
}