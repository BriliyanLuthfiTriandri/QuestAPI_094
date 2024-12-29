package com.example.pertemuan12database.repository

import com.example.pertemuan12database.model.Mahasiswa
import com.example.pertemuan12database.service_api.MahasiswaService
import okio.IOException


interface MahasiswaRepository{

    suspend fun getMahasiswa(): List<Mahasiswa>

    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)

    suspend fun updateMahasiswa(nim: String, mahasiswa: Mahasiswa)

    suspend fun deleteMahasiswa(nim: String)

    suspend fun getMahasiswaByNim(nim: String):Mahasiswa
}

