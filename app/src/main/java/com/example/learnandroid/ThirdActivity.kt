package com.example.learnandroid

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdActivity : BaseActivity() {

    private val TAG = "mylog_ThirdActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        Log.d("ThirdActivity", "Task id is $taskId")
        setContentView(R.layout.third_layout)
        val buttonClear: Button = findViewById(R.id.button_clear)
        buttonClear.setOnClickListener() {
            Log.v(TAG, "clear all, bye bye!")
            ActivityCollector.finishAllActivity()
        }

    }
}