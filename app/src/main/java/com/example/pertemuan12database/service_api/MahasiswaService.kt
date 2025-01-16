package com.example.pertemuan12database.service_api

import com.example.pertemuan12database.model.Mahasiswa
import com.example.pertemuan12database.model.MahasiswaResponse
import com.example.pertemuan12database.model.MahasiswaResponseDetail
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface MahasiswaService {
    @Headers(
        "Accpet: application/json",
        "Content-Type: application/json",
    )

//    @GET("bacamahasiswa.php")
//    suspend fun getMahasiswa(): List<Mahasiswa>
//
//    @GET("baca1mahasiswa.php/{nim}")
//    suspend fun getMahasiswaByNim(@Query("nim") nim: String): Mahasiswa
//
//    @POST("insertmahasiswa.php")
//    suspend fun insertMahasiswa(@Body mahasiswa: Mahasiswa)
//
//    @PUT("editmahasiswa.php/{nim}")
//    suspend fun updateMahasiswa(@Query("nim") nim: String, @Body mahasiswa: Mahasiswa)
//
//    @DELETE("deletemahasiswa.php/{nim}")
//    suspend fun deleteMahasiswa(@Query("nim") nim: String): Response<Void>

    @GET(".")
    suspend fun getMahasiswa(): MahasiswaResponse

    @GET("{nim}")
    suspend fun getMahasiswaByNim(@Path("nim") nim: String): MahasiswaResponseDetail

    @POST("store")
    suspend fun insertMahasiswa(@Body mahasiswa: Mahasiswa)

    @PUT("{nim}")
    suspend fun updateMahasiswa(@Path("nim") nim: String, @Body mahasiswa: Mahasiswa)

    @DELETE("{nim}")
    suspend fun deleteMahasiswa(@Path("nim") nim: String): Response<Void>
}