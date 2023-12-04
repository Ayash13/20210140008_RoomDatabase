package com.example.kotlin_repo.model

import androidx.lifecycle.ViewModel
import com.example.kotlin_repo.repositori.RepositoriSiswa

class HomeViewModel(private val repositoriSiswa: RepositoriSiswa): ViewModel() {
    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }
}