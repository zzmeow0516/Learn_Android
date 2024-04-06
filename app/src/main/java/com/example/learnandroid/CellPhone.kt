package com.example.learnandroid

//采用data修饰class, 类中的toString, equal, hashCode会自动override
 data class CellPhone(var brand: String, var price: Double)