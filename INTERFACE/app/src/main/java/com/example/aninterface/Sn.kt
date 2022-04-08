package com.example.aninterface

fun main() {
    val wl = window()
    println(wl.opearatiinSystem())
    println(wl.buildBy())
    println(wl.buildYear())
}
class window : My {
    override fun opearatiinSystem(): String {
        return "MACK"
    }

    override fun buildYear(): Int {
        return 2022
    }

    override fun buildBy(): String {
        return "Swapnil"
    }

}