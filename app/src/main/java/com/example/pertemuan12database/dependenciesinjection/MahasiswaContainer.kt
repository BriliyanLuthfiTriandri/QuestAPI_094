package com.example.pertemuan12database.dependenciesinjection

import com.example.pertemuan12database.repository.MahasiswaRepository
import com.example.pertemuan12database.repository.NetworkMahasiswaRepository
import com.example.pertemuan12database.service_api.MahasiswaService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

interface AppContainer {
    val MahasiswaRepository: MahasiswaRepository
}
