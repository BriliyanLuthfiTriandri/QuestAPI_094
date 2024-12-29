package com.example.pertemuan12database.ui.viewmodel


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import coil.network.HttpException
import com.example.pertemuan12database.model.Mahasiswa
import com.example.pertemuan12database.repository.MahasiswaRepository
import kotlinx.coroutines.launch
import okio.IOException




class HomeViewModel(private val mhs: MahasiswaRepository) : ViewModel() {
    var mhsUIState: HomeUiState by mutableStateOf(HomeUiState.Loading)
        private set

    init {
        getMhs()
    }

}
