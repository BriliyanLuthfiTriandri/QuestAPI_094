package com.example.pertemuan12database

import android.app.Application
import com.example.pertemuan12database.dependenciesinjection.AppContainer
import com.example.pertemuan12database.dependenciesinjection.MahasiswaContainer

class MahasiswaApplication : Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}