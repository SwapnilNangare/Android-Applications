package com.example.kotlin

fun main()
{
    println("While & Do-While Loops")
    var count=1
    while (count<=5)
    {
        println("Hello Swapnil")
        count++
    }

    var two=2
    var one=1
    while (one<=10)
    {
        println(two * one)
        one++
    }
    //do while loop
    var idx=1
    do {
        println("Hello")
        idx++
    }while (idx<5)

    //For loop and ranges use in for loop

    for (i in 1..5)
        println(i)
    println("Steps")
    for (i in 1..5 step 2)
        println(i)
    println("Until")
    for (i in 1 until 3 )
        println(i)
      println("downTO")
    for (i in 5 downTo  0 )
        println(i)
    println("downTO and step")
    for (i in 10 downTo 0 step 2  )
        println(i)


    //for loop
    println("For Loop")
    var number=2
    for(i in 1..10)
    {
        println(number * i)
    }
}
