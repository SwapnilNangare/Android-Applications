package com.example.kotlin

fun main()
{
    /* if(condition)
    {
    run this code if condition is true
    }
    else
    run this code if condition is false
     */
  val isRaining=true
    if(isRaining==true)
    {
        println("Take umbrella")
    }
    else
    {
        println("No Rain -Enjoy Your day")
    }

    var x=10
    var y=10

    if(x>y)
    {
        println("X is Greater than y")
    }

    else if(x<y)
    {
        println("y is Greater than x")

    }
    else
    {
        println("y is Equal to x")
    }
  val number=21
  val result= if(number%2==0) "even" else "odd"
    println(result)




}