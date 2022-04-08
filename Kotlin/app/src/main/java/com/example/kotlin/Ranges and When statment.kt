package com.example.kotlin

fun main()
{
//Ranges
    val number=1
    val Resutl=number in 1..5
    println(Resutl)

//when statements
val animal=""
 val result= when(animal)
    {
        "Hourse"->"Animal is Hourse"
        "Dog"->"Animal is Dog"
        "Cat"->"Animal is Cat"
        "Panda"->"Animal is Panda"
        else->"Animal Not Found"
    }
    println(result)
}