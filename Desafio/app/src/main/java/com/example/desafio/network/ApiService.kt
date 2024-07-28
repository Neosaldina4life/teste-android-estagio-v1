package com.example.desafio.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    private const val BASE_URL = "https://api.olhovivo.sptrans.com.br/v2.2/"

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val service: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }

    suspend fun authenticate(apiKey: String): Boolean {
        val response = service.authenticate(apiKey)
        return response.isSuccessful
    }
}