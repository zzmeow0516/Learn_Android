package com.example.learnandroid

import android.app.Activity
import android.util.Log

//使用单例类，因为全局只需要一个activity集合
object ActivityCollector {

    private val TAG = "mylog_ActivityCollector"

    private val activities = ArrayList<Activity>()

    fun addActivity(activity: Activity){
        activities.add(activity)
        Log.v(TAG, "addActivity()")
    }

    fun removeActivity(activity: Activity){
        activities.remove(activity)
        Log.v(TAG, "removeActivity()")
    }

    fun finishAllActivity(){
        for (activity in activities) {
            if (!activity.isFinishing) {
                activity.finish()
            }
        }
        activities.clear()
    }

}