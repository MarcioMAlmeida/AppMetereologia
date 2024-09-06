package com.example.appmetereologia.data.repositories

import com.example.appmetereologia.data.model.WeatherInfo
import com.example.appmetereologia.data.remote.response.Weather

interface WeatherRepository {

    suspend fun getWeatherData(lat: Float, lng: Float): WeatherInfo
}