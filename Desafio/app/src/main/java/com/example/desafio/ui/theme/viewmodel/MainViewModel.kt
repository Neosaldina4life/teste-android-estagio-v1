package com.example.desafio.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.desafio.R
import com.example.desafio.network.ApiClient
import kotlinx.coroutines.launch

class MainViewModel(application: Application) : AndroidViewModel(application) {

    var isAuthenticated = false
        private set

    fun authenticate() {
        val apiKey = getApplication<Application>().getString(R.string.api_token)
        viewModelScope.launch {
            isAuthenticated = ApiClient.authenticate(apiKey)
        }
    }
}
