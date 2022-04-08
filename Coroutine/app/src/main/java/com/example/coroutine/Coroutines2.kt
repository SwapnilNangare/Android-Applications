package com.example.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main(){
    println("main Program start: ${Thread.currentThread().name}")

    GlobalScope.launch{
        println("Fake work starts: ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("Fake work Finished: ${Thread.currentThread().name}")
    }
    Thread.sleep(2000)
    println("Main Program End: ${Thread.currentThread().name}")
}