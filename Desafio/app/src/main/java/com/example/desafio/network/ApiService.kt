package com.example.desafio.network

import com.example.desafio.model.ArrivalForecastResponse
import com.example.desafio.model.BusLinesResponse
import com.example.desafio.model.BusStopsResponse
import com.example.desafio.model.VehiclePositionsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface ApiService {
    @GET("Posicao")
    suspend fun getVehiclePositions(@Header("token") token: String): Response<VehiclePositionsResponse>

    @GET("Parada")
    suspend fun getBusStops(@Header("token") token: String): Response<BusStopsResponse>

    @GET("Linha")
    suspend fun getBusLines(@Header("token") token: String): Response<BusLinesResponse>

    @GET("Previsao/Parada/{stopCode}")
    suspend fun getArrivalForecast(@Header("token") token: String, @Path("stopCode") stopCode: String): Response<ArrivalForecastResponse>
}
