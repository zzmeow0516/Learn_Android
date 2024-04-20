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

    //start OOP
    //实例化Hero, kotlin中不需要用到new
    val h1 = Hero()
    h1.name = "yase"
    h1.occupation = allOccupation[1]
    println("h1's occupation is " + h1.occupation + ", h1's name is " + h1.name)


    //多态，接口
    val h2 = Tank()
    h2.name = "daji"
    h2.occupation = allOccupation[3]

    //h2实例化后，我们把h2作为参数传递到_moveAndAttack函数中，为什么可以传递？
    //因为, 我们定义 _moveAndAttack函数接收到一个Tank类的参数，由于Tank类实现了moveAndAttack接口
    //因此，Tank类的实例h2就可以传递到 _moveAndAttack函数中,从而调用Tank类里面的函数（重写move 和 attack）
    _moveAndAttack(h2)

    //data class
    var phone1 = CellPhone("xiaomi", 2999.0)
    var phone2 = CellPhone("iPhone", 6999.0)
    //CellPhone类如果不用data修饰，那么打印出来的就只是phone1对象的内存地址
    println(phone1)
    println("two cellphone are diff ? " + (phone1 != phone2))


    //lambda
    lambdaPrac()


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


//主构造函数，次构造函数待学习


//多态: _moveAndAttack函数的形参为moveAndAttack类
fun _moveAndAttack(para1: moveAndAttack) {
    para1.move()
    para1.attack()
}

//字符串内嵌表达式 $

//lambda编程
fun lambdaPrac() {
    //这边使用 List
    val Heros = listOf("daji", "yase", "houyi")
    val fruits = mutableListOf("apple", "watermelon")
    fruits.add("grapes")

    //这边使用 map： key-value
    //这个 to 实际上调用的是 infix
    val fruits1 = mapOf("apple" to 1, "watermelon" to 2, "banana" to 3)
    val map1 = mutableMapOf("apple" to 1, "watermelon" to 2, "banana" to 3)
    map1.put("grapes", 4)

    //map的遍历方式
    for ((fruits, num) in map1) {
        println("fruits = $fruits, num is $num")
    }

    //集合的函数式API ---minBy
    val lambda1 = {fruits: String -> fruits.length}
    val maxLenth = fruits.minBy(lambda1)
    println("maxLength = $maxLenth")
    //逐步简化
    val maxLength1 = fruits.minBy({fruits: String -> fruits.length})
    val maxLength2 = fruits.minBy () {fruits: String -> fruits.length  }        //lambda是最后一个参数，可以写到括号外面
    val maxLength3 = fruits.minBy {fruits: String -> fruits.length  }           //只有一个参数，括号也不用写了
    val maxLength4 = fruits.minBy { fruits -> fruits.length }                   //类型推导
    val maxLength5 = fruits.minBy { it.length }                                 //lambda表达式也只有一个参数，省略参数名，用it代替

    //集合的函数式API ---map: 把集合中的元素都映射成另外一个值
    val FRUITS = fruits.map { it.uppercase() }
    //集合的函数式API ---filter
    //先filter再uppercase
    val FRUITS1 = fruits.filter { it.length > 5 }.map {it.uppercase()}

    //集合的函数式API ---any, all
    val anyResult = fruits.any { it.length < 5 }
    val allResult = fruits.all { it.length > 5 }
}



