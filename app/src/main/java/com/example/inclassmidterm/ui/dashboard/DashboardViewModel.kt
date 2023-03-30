package com.example.inclassmidterm.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {
    var startTime = System.currentTimeMillis()
    var currentTime = System.currentTimeMillis()
    var timeElapsed = System.currentTimeMillis()

    private val _text = MutableLiveData<String>().apply {
        value = "$timeElapsed"
    }
    val text: LiveData<String> = _text

    fun startTime() {
        startTime = System.currentTimeMillis()
    }
    fun pauseTime() {

    }
}