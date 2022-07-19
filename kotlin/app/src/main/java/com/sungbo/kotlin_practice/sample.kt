package com.sungbo.kotlin_practice

fun main() {
    helloWorld()

    println(add(4, 5))

    // 3. String Template
    val name = "sungbo"
    val lastName = "Kim"
    println("My name is $name. nice to meet you")
    println("My name is ${name}. nice to meet you")
    println("My name is ${name + lastName}. nice to meet you")

    // 달러표시가 사용하고 싶으면 back slash  로 escape
    println("This is \$9 dollars")

    checkNum(1)

    forAndWhile()

    nullcheck()



}

// 1. 함수

fun helloWorld() : Unit {
    // Unit = Void 와 같은 의미 (return 형태가 없을때)
    println("Hello World!")
}

// 변수명 먼저, 타입 후에
fun add(a : Int, b: Int) :Int {
    return a+b
}

// 2. val vs var
// val = value = 바뀌지 않음 상수
// var = variable = 변수

fun hi(){
    val a : Int = 10
    var b : Int = 20

    // a cannot be assigned
    //a = 100

    b = 100

    // Int라고 굳이 적지 않아도 써주지 않아도 됨
    val c = 10
    var d = 100

    var name = "sungbo"

    // 바로 할당 안할땐, 명시 해줘야함
    var e:String

}

// 4. 조건식
fun maxBy(a: Int, b:Int):Int {
    if( a > b){
        return a
    }
    else{
        return b
    }
}

fun maxBy2(a:Int, b:Int) = if (a>b) a else b

fun checkNum(score: Int) {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
        // else 생략 가능
        else -> println("I don't know")
    }

    var b = when(score){
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b : ${b}")

    when(score){
        in 90..100 -> println("You are genius")
        in 80..90 -> println("not bad")
        else -> println("okay")
    }
}

// expression vs statement

// 5. array vs list

// array = 메모리가 이미 할당이 되어서 나오기 때문에 처음에 크기를 지정해 주어야함
// list
// 1. immutable list = 수정 불가능
// 2. mutable list = 수정가능

fun array(){
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "d", 0.34f)
    val list2 = listOf(1, "d", 23L)

    array[0] = 3

    // 리스트 원소변경 불가
    // list[0] = 2
    var result = list.get(0)

    val list3 = mutableListOf<Any>(1, 2, "D", 2.3f)
    list3[3] = 3

    var arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)

}

// 6. for / while

fun forAndWhile(){
    val students = arrayListOf("joyce", "james", "jenny","jennifer")

    for ( name in students){
        println("${name}")
    }

    for ((index, name) in students.withIndex()){
        println("${index + 1}번째 학생 : ${name}")
    }

    var sum : Int = 0
    for (i in 1..10 step 2){
        sum += i
    }
    println(sum)

    for (i in 10 downTo 1){
        print("${i} ")
    }
    println()

    for ( i in 1 until 100){
        print( "${i} ")
    }
    println()
    var index = 0
    while (index < 10){
        print("${index} ")
        index += 1
    }
}

// 7. Nullable / NonNull
fun nullcheck(){
    // NPE : Null pointer Exception

    var name : String = "sungbo"
    var nullName: String? = null

    var nameInUpperCase = name.toUpperCase()

    // nullName이 null 이 아니면 upper case, null이면 null 반환
    var nullNameInUpperCase = nullName?.toUpperCase()

    // ?: null 대신 default 값을 주고 싶을때
    val lastName : String? = null

    val fullName = name + " " + (lastName?: "No lastName")

    println(fullName)


}

// !! 컴파일러에게 null 아니라고 보증해 주는것
fun ignoreNulls(str: String?){
    val mNotNull : String = str!!
    val upper = mNotNull.toUpperCase()

    val email : String? = "asdfasdf@nana.com"
    // email 이 null이 아니면 이걸 해라
    email?.let{
        println("my email is ${email}")
    }
}