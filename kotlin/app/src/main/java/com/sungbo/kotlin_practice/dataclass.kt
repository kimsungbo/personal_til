package com.sungbo.kotlin_practice

// 한 파일안에서 여러가지 클래스를 만들 수 있음
// 연관데 클래스는 한곳에 모을 수 있음 --> 굉장히 관리하기 편리
// toString(), hashCode(), equals(), copy() 다 자동으로 만들어줌
data class Ticket(val airline: String, val name: String, var date: String, var setNum: Int)

class TicketNormal(val airline: String, val name: String, var date: String, var setNum: Int)

fun main(){
    val ticketA = Ticket("koreanAir", "joyceHong", "2020-02-16", 4)
    val ticketB = TicketNormal("koreanAir", "joyceHong", "2020-02-16", 4)

    println(ticketA)
    println(ticketB)
}