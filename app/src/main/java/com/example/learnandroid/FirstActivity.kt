package com.example.learnandroid

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class FirstActivity : AppCompatActivity() {
    //项目中的任何activity都需要override onCreate()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //调用setContentView为当前的activity加载first_layout布局
        setContentView(R.layout.first_layout)
    }
}