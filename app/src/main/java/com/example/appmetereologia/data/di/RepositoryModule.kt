package com.example.appmetereologia.data.di

import androidx.lifecycle.ViewModel
import com.example.appmetereologia.data.repositories.WeatherRepository
import com.example.appmetereologia.data.repositories.WeatherRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface RepositoryModule {

    @Binds
    fun bindWeatherRepository(repository: WeatherRepositoryImpl) : WeatherRepository
}