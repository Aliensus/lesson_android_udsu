package com.example.lesson_android_udsu.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lesson_android_udsu.api.RetrofitProvider
import com.example.lesson_android_udsu.data.Response
import com.example.lesson_android_udsu.data.User
import io.reactivex.disposables.Disposable
import retrofit2.Call
import retrofit2.Callback

class MainViewModel: ViewModel() {

    private val _userList: MutableLiveData<List<User>> = MutableLiveData()
    val userList: LiveData<List<User>> = _userList

    //private val disposable: Disposable

    init {
        RetrofitProvider.userService.getUsers()
            .enqueue(object : Callback<Response> {
                override fun onResponse(
                    call: Call<Response>,
                    response: retrofit2.Response<Response>
                ) {
                    response.body()?.let { body ->
                        _userList.postValue(body.users)
                    }

                }

                override fun onFailure(call: Call<Response>, t: Throwable) = Unit
            })

    }
    /*
    override fun onCleared() {
        super.onCleared()
        disposable.dispose()
    }*/
}

