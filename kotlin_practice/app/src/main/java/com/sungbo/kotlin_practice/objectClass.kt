package com.sungbo.kotlin_practice

// singleton pattern
// car factory 에 계속 새로운 개체를 만드는게 아니라 실행시 한번만 생성됨
object CarFactory{
    val cars : MutableList<Car> = mutableListOf<Car>()
    fun makeCar(horsePower: Int): Car{
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val horsePower : Int)

fun main(){
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}