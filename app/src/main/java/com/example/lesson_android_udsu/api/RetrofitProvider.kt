package com.example.lesson_android_udsu.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitProvider {

    val retrofit: Retrofit by lazy { createRetrofit() }

    val userService: UserService by lazy { retrofit.create(UserService::class.java) }

    private fun createRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://reqres.in/")
            .addConverterFactory(GsonConverterFactory.create())
            //.addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .build()
    }

}