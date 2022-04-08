package com.example.rxjava

import io.reactivex.rxjava3.core.Flowable


object HelloWorld {
    @JvmStatic
    fun main(args: Array<String>) {
        Flowable.just("Hello Swapnil").subscribe { x: String? -> println(x)
        }
    }
}