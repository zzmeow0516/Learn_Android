package com.example.learnandroid

//define interface
interface moveAndAttack {
    fun move()

    //在接口定义中就默认实现attack(), 从而导致，，其他类想要实现moveAndAttack接口时，
    //attack函数可以自由选择实现/不实现，如果不在类中实现，调用的就是接口中默认实现的attack().
    fun attack() {
        println("we attack in interface, so we have not to implement it in other class")
    }

}