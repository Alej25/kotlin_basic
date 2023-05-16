package com.example.koltinbasics1

open class Person(val firtsName:String, val lastName : String) {
    var tax :Float = 10.0f
    get() = 1 - (field*0.01f)

    var slary:Float=0f
    set(value) {
        field= value
    }
    get() = field*tax

    //funciones
    fun fullName()= "$firtsName $lastName"
    open fun showWork():String{
        return "capturnado datos"
    }
}