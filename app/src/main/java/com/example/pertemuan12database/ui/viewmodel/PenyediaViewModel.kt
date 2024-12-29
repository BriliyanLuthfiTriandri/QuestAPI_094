package com.example.pertemuan12database.ui.viewmodel


import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.pertemuan12database.MahasiswaApplication


object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer { HomeViewModel(aplikasiMahasiswa().container.MahasiswaRepository) }
        initializer { InsertViewModel(aplikasiMahasiswa().container.MahasiswaRepository) }
        initializer { DetailViewModel(aplikasiMahasiswa().container.MahasiswaRepository) }
        initializer { UpdateViewModel(createSavedStateHandle(),aplikasiMahasiswa().container.MahasiswaRepository) }
    }
}

fun CreationExtras.aplikasiMahasiswa(): MahasiswaApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaApplication)