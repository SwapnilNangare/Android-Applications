package com.example.threading

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main()
{
    println("Main program Started :${Thread.currentThread().name}")


    //creating a background and worker Thread
    GlobalScope.launch {
        println("Fack worker thred :${Thread.currentThread().name}")
        println("Fack worker finesh :${Thread.currentThread().name}")


    }
    Thread.sleep(1000)

    println("Main program ends :${Thread.currentThread().name}")

}