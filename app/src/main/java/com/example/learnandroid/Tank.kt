package com.example.learnandroid

//Tank类继承Hero类，实现moveAndAttack接口，在冒号后面用逗号隔开就可以
class Tank : Hero() , moveAndAttack{
    var extraHP = 0

    override fun move() {
        println("tank is moving")
    }

    /*
    //在接口定义中默认实现，所以这边可以不重写attack()
    override fun attack() {

        println("tank is attacking")
    }
     */
}