package com.example.learnandroid

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
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

        /*
        * 在Activity中，可以通过findViewById()方法获取在布局文件中定义的元素，这里我们传入
        R.id.button1来得到按钮的实例，这个值是刚才在first_layout.xml中通过android:id属
        性指定的。
        * findViewById()方法返回的是一个继承自View的泛型对象，因此Kotlin无法自动
        推导出它是一个Button还是其他控件，所以我们需要将button1变量显式地声明成Button类
        型。
        * 得到按钮的实例之后，我们通过调用setOnClickListener()方法为按钮注册一个监听
        器，点击按钮时就会执行监听器中的onClick()方法。因此，弹出Toast的功能当然是要在
        onClick()方法中编写了。
        Toast的用法非常简单，通过静态方法makeText()创建出一个Toast对象，然后调用show()
        将Toast显示出来就可以了。
        * 这里需要注意的是，makeText()方法需要传入3个参数。第一个参数是Context，也就是Toast要求的上下文，
        * 由于Activity本身就是一个Context对象，因此
        这里直接传入this即可。第二个参数是Toast显示的文本内容。第三个参数是Toast显示的时
        长，有两个内置常量可以选择：Toast.LENGTH_SHORT和Toast.LENGTH_LONG。
        */
        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener {
            Toast.makeText(this, "hello, we click button1", Toast.LENGTH_SHORT).show()
        }


        //这种方式已经被弃用了，现在采用viewBinding....
       /*
        button1.setOnClickListener {
            Toast.makeText(this, "we clicked a button", Toast.LENGTH_LONG).show()
        }
        */

    }
}