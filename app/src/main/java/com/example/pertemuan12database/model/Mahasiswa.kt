package com.example.pertemuan12database.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class MahasiswaResponseDetail(
    val status: Boolean,
    val message: String,
    val data: Mahasiswa
)

@Serializable
data class MahasiswaResponse(
    val status: Boolean,
    val message: String,
    val data: List<Mahasiswa>

)

@Serializable
data class Mahasiswa(
    val nim: String,
    val nama: String,
    val alamat: String,
    val jenisKelamin: String,
    val kelas: String,
    val angkatan: String,
)