package com.sungbo.kotlin_practice

// static 대신 companion 사용

class Book private constructor (val id: Int, val name:String){


    companion object BookFactory: IdProvider{

        override fun getId(): Int {
            return 444
        }
        val myBook = "new book"

        fun creat() = Book(getId(), myBook)

    }
}

interface IdProvider {
    fun getId() : Int
}

fun main(){
    val book = Book.creat()
    val bookId = Book.BookFactory.getId()
    println("${book.id} ${book.name}")
}