package com.sungbo.kotlin_practice

open class Human (val name2 : String = "Anonymous"){

    init {
        println("new human has been born")
    }
    constructor(name: String, age:Int): this(name){
        println("my name is ${name}, ${age}years old")

    }
    val name = "asdf"

    fun eatingCake(){
        println("This is so yummy")
    }
    open fun singASong(){
        println("lala")

    }
}

// 부모 class를 open 해 줘야 상속 받을 수 있음
class Korean: Human(){
    override fun singASong(){
        println("라라랄")
        super.singASong()
        println("my name is ${name2}")
    }

}

fun main(){
    val human = Human("minsu")
    val stranger = Human()
    human.eatingCake()
    println("this human's name is ${human.name2}")
    println("this stranger's name is ${stranger.name2}")

    val mom = Human("dddd", 53)

    val korean = Korean()
    korean.singASong()
}