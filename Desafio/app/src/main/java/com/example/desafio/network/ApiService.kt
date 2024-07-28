package com.example.desafio.network

import com.example.desafio.model.*
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("Posicao")
    suspend fun getVehiclePositions(@Query("token") token: String): VehiclePositionsResponse

    @GET("Parada")
    suspend fun getBusStops(@Query("token") token: String): BusStopsResponse

    @GET("Linha")
    suspend fun getBusLines(@Query("token") token: String): BusLinesResponse

    @GET("Previsao")
    suspend fun getArrivalForecast(@Query("token") token: String, @Query("codigoParada") stopCode: Int): ArrivalForecastResponse
}

