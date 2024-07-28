package com.example.desafio.network

import retrofit2.Response
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {
    @POST("Login/Autenticar")
    suspend fun authenticate(@Query("token") apiKey: String): Response<Unit>
}