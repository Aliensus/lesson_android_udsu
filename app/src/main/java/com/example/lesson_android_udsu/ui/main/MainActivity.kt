package com.example.lesson_android_udsu.ui.main

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.lesson_android_udsu.ListActivity
import com.example.lesson_android_udsu.R
import com.example.lesson_android_udsu.ui.base.BaseActivity

class MainActivity : BaseActivity<MainViewModel> (MainViewModel::class) {


    override val layoutId: Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val textView = findViewById<TextView>(R.id.textView)

        viewModel.userList.observe {
            findViewById<TextView>(R.id.textView).text = it.toString()
        }

        val button: Button = findViewById(R.id.buttonList)
        button.setOnClickListener{
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }
    }
}