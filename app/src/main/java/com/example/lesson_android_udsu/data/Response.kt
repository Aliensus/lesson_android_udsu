package com.example.lesson_android_udsu.data

import com.google.gson.annotations.SerializedName

class Response {
    @SerializedName("data")
    val users: List<User>
}