package com.example.learnandroid

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : BaseActivity() {

    private final val TAG = "myLog_SecondActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        Log.d(TAG, "Task id is $taskId")
        setContentView(R.layout.second_layout)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //接收来自FirstActivity的intent
        //这边使用getIntExtra,参数分别是key和默认值
        val data = intent.getIntExtra("AUDIO_OUT_STREAM_MUSIC",0)
        //$data 是 Kotlin 中的字符串模板语法的一部分。它允许你在字符串中嵌入变量的值
        Log.v(TAG, "intent data is $data")

        val button: Button = findViewById(R.id.button_another1)
        button.setOnClickListener() {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
            //returnResult()
        }

    }

    //for Android Activity API
    private fun returnResult() {
        val resultIntent = Intent()
        val resultKey = "music done"
        val resultValue = 1
        resultIntent.putExtra(resultKey, resultValue)
        Log.v(TAG, "resultKey = $resultKey, resultValue = $resultValue")
        setResult(Activity.RESULT_OK, resultIntent)
        finish()
    }
}