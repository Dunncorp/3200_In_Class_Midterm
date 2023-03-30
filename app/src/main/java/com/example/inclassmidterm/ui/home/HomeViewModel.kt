package com.example.inclassmidterm.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

data class TimerState(
    var sTime: Long,
    var elapsedTime: Long,
    var isRunning: Boolean,
)

class HomeViewModel(val timerState: TimerState) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "${timerState.elapsedTime}"
    }
    val text: LiveData<String> = _text

    fun startTimer(timerState: TimerState) {
        if (!timerState.isRunning) {
            timerState.sTime = System.currentTimeMillis()
            timerState.isRunning = true
        }
    }
    fun pauseTimer(timerState: TimerState) {
        if (timerState.isRunning) {
            val currentTime = System.currentTimeMillis()
            timerState.elapsedTime = timerState.elapsedTime + (currentTime - timerState.sTime)
            timerState.isRunning = false
        }

    }
    fun resetTimer(timerState: TimerState) {
        if (timerState.isRunning) {
            timerState.elapsedTime = 0L
            timerState.isRunning = false
        }
    }
}