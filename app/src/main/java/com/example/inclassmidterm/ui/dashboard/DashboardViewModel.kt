package com.example.inclassmidterm.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {
    var sTime = System.currentTimeMillis()
    var timeElapsed = System.currentTimeMillis()

    private val _text = MutableLiveData<String>().apply {
        value = "$timeElapsed"
    }
    val text: LiveData<String> = _text

    fun startTime() {
        sTime = System.currentTimeMillis()
    }
    fun pauseTime() {
        timeElapsed += (sTime - System.currentTimeMillis())
    }
}