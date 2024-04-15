package com.example.learnandroid

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

//Skill 1 :
//为了知道当前界面是哪一个activity，我们新建了一个BaseActivity，然后修改其他activity的继承关系
//这样其他activity启动时，就会通过javaClass.simpleName获取当前实例的类名
open class BaseActivity() : AppCompatActivity(), Parcelable {

    private val TAG = "mylog_BaseActivity"

    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Kotlin中的javaClass表示获取当前实例的Class对象
        //Kotlin中的BaseActivity::class.java表示获取BaseActivity类的Class对象
        Log.v(TAG, javaClass.simpleName)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<BaseActivity> {
        override fun createFromParcel(parcel: Parcel): BaseActivity {
            return BaseActivity(parcel)
        }

        override fun newArray(size: Int): Array<BaseActivity?> {
            return arrayOfNulls(size)
        }
    }
}