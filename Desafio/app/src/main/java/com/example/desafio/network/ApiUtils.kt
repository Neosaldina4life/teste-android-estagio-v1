package com.example.desafio.network

object ApiUtils {
    const val API_TOKEN = "YOUR_API_TOKEN_HERE"

    fun isValidResponse(responseCode: Int): Boolean {
        return responseCode in 200..299
    }
}