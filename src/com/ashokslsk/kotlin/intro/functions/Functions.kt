package com.ashokslsk.kotlin.intro.functions

/**
 * Created by ashok.kumar on 06/09/17.
 */

fun hello(): Unit {
    println("Hello World")
}

fun throwingException(): Nothing {
    throw Exception("Throwing exception")
}

fun returnsFour(): Int {
    return 4
}


fun main(args: Array<String>) {
    hello()
    val integerValue  = returnsFour()
    println(integerValue)
}