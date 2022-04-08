package com.example.kotlin

fun main()
{
    println("Hello Kotlin")
    println(1+3)

    // Variables and data types storing the data
     //var->reassigned but val can not reassigned

    var salary=32000
    val price=1234
    salary=4455
    //price=3333  val can not reassigned
    println(salary)
    println(price)

    // Data Types

    var score:Int=123
    var temperature:Double=1.2
    var isRaning:Boolean=true
    var alphabet:Char='A'
    var message:String="This mag"

    var i=10
    println(i++ + ++i)

    //Logical operator and short circuiting

    val above70=true
    val knowPrograming=false

  // && AND operator->if both value are true ans is true otherwise false
    var calledForIntriew=above70 && knowPrograming
    println(calledForIntriew)

     //OR || operator  if one value is true result is true and both value are false result is false

    calledForIntriew=above70 || knowPrograming
    println(calledForIntriew)

    // ! not operator reverse result showing
    val answer=false
    val result=!answer
    println(result)



}