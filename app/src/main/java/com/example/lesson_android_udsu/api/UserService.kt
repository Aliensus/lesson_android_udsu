package com.example.lesson_android_udsu.api

import com.example.lesson_android_udsu.data.Response
import com.example.lesson_android_udsu.data.User
import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.GET

interface UserService {
    @GET("api/users?page=2")
    fun getUsers(): Call<Response>


}


