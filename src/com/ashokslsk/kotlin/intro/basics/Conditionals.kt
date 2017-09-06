package com.ashokslsk.kotlin.intro.basics

/**
 * Created by ashok.kumar on 06/09/17.
 */

fun main(args: Array<String>) {

    //if conditionals
    var myString = "Not empty right now"

    val result = if (myString != "") {
        "Not empty"
    } else {
        "Empty"
    }

    when (result){
        is String -> println("excellent")
        "Value" -> println("The result is a value")
    }
}