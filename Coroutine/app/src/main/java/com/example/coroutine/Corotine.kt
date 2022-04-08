package com.example.coroutine
//import kotlinx.coroutinees.*

import kotlin.concurrent.thread

fun main()
{
    println("Coroutines Project")
    println("Main program starts :${Thread.currentThread().name}")
    //create a background thread(worker thread)

    thread{

        println("Fake worker started :${Thread.currentThread().name}")
        Thread.sleep(1000)  //preceding doing some work ...may be file upload
        println("Fake worker Finished :${Thread.currentThread().name}")

    }
    //blocks the current main thread & wait for coroutine to finish(practically not a right way to wait)
    Thread.sleep(2000)
    println("Main program ends :${Thread.currentThread().name}")

}