package com.example.desafio.network

object ApiUtils {
    const val API_TOKEN = "0caf2ddc4ee78fd7af853f1e9c8b5a6681c6eda1dfaa06ed8b47a5271164c856"

    fun isValidResponse(responseCode: Int): Boolean {
        return responseCode in 200..299
    }
}