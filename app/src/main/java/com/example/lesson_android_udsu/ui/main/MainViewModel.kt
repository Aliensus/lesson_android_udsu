package com.example.lesson_android_udsu.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private val _userList: MutableLiveData<String> = MutableLiveData()
    val userList: LiveData<String> = _userList

    init {
        val thread = Thread {
            Thread.sleep(3_000)
            _userList.postValue("Goodbye Hell!!")
        }
        thread.start()
    }
}