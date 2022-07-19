package com.sungbo.kotlin_practice


// 1. lambda
// 람다식은 우리가 마치 value 처럼 다룰 수 있는 익명 함수이다.
// 1) 메소드의 파라미터로 넘겨줄 수 있다. fun maxBu(a:Int) a 대신에 함수를 넣을 수 있음
// 2) return 값으로 사용할 수 있다.

// 람다의 기본 정의
// val lambdaName : Type = {argumentList -> codeBody}

val square : (Int) -> (Int) = { number -> number * number}

val nameAge = { name: String, age : Int ->
    "my name is ${name} I'm ${age} "
}

fun main(){
    println(square(12))
    println(nameAge("joyce", 99))

    val a = "joyce said"
    val b = "mac said"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("ariana", 27))

    println(calculateGrade(23))

    val lamda = {number : Double ->
        number == 4.3213
    }

    println(invokeLamda(lamda))
    println(invokeLamda({it > 3.22}))

    println(invokeLamda { it > 3.22 })


}

// 확장함수: 클래스에 조금 더 확장된 함수를 추가 하고 싶을때
val pizzaIsGreat: String.() -> String = {
    this + "Pizza is the best"
}

fun extendString(name : String, age: Int):String {
    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}

//람다의 return
var calculateGrade : (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 40..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

// 람다를 표현하는 방식
fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.234)
}

