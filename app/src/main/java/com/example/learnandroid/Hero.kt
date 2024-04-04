package com.example.learnandroid

class Hero {
    //hero's property,we need to change name and occupation,so var
    var name = ""
    //we should define array to experss occupation
    //val names: Array<String> = arrayOf("Alice", "Bob", "Charlie")
    var occupation: Array<String> = arrayOf(
        "tank",
        "warrior",
        "assassin",
        "mage",
        "shooter",
        "assistant",
    )

    //hero's skill
    fun passive(){}
    fun skill1(){}
    fun skill2(){}
    fun skill3(){}
}