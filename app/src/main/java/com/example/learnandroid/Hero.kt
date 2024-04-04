package com.example.learnandroid

//set class Hero as open, so that is can be extended.
open class Hero {
    //hero's property,we need to change name and occupation,so use var
    var name = ""
    var occupation = ""

    //hero's skill
    fun passive(){}
    fun skill1(){}
    fun skill2(){}
    fun skill3(){}
}

//we should define array to experss occupation
//val names: Array<String> = arrayOf("Alice", "Bob", "Charlie")
//use arrayOf we have not to define var occupation Array<String>
var allOccupation = arrayOf(
    "tank",
    "warrior",
    "assassin",
    "mage",
    "shooter",
    "assistant",
)