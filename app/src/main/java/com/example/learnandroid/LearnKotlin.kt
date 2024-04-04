package com.example.learnandroid

import kotlin.math.max


//prac for, while
var range1 = 0..10
var range2 = 0 until 10
var range3 = 10  downTo 0


fun main() {
    val a = 1
    val b = 2
    val result = max(a, b)
    println("result = " + result)

    //prac for-in, step
    for(i in range1) {
        println(i)
    }

    for(i in range2 step 3) {
        println(i)
    }
}

fun bigger(para1 : Int, para2 : Int) : Int {
    return max(para1, para2)
}

//语法糖
fun bigger2(para1: Int, para2: Int) = max(para1, para2)


//if, when 都可以有返回值
fun prac_if(para1: Int, para2: Int) = if(para1 >= para2) {
    para1
}
    else {
        para2
}

//prac kotlin : when
fun prac_when1(num: Number) = when {
    num is Int -> println("num is Int")
    num is Float -> println("num is Float")
    num is Double -> println("num is Double")
    else -> println("invalid num")
}

//直接用when(para1)进行字符串匹配
fun prac_when2(str: String) = when(str) {
    "zly" -> println("you are zly")
    "cwq" -> println("you are cwq")
    else -> println("who are you")
}

//when 搭配字符串函数startWith
fun prac_when3(str: String)  = when {
    str.startsWith("ahahaha") -> 2333
    //must add else ,otherwise wo can not pass compile
    else -> println("waiting for add ...")
}

//--------------------------------------
//start OOP
