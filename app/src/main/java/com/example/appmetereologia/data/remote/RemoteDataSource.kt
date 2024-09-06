package com.example.appmetereologia.data.remote

import com.example.appmetereologia.data.remote.response.WeatherDataResponse

interface RemoteDataSource {

    suspend fun getWeatherDataResponse(lat: Float, lng: Float): WeatherDataResponse
}