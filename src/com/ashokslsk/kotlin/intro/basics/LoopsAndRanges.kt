package com.ashokslsk.kotlin.intro.basics

/**
 * Created by ashok.kumar on 25/06/17.
 */
fun main(args: Array<String>) {


    for (a in 1..100){
        //It will print from 1 to 100
        println(a)
    }

    val numbers = 1..900
    for (a in numbers){
        println(a)
    }

    // if want a reverse order loop
    for (a in 100 downTo 1){
        println(a)
    }

    // A little bit more complex loop
    for (b in 1000 downTo 1 step 10){
        println(b)
    }

    val Names = listOf("Ashok","Pavan", "Keerthi", "Thiru Windows", "Sanjay", "santosh")
    for (name in Names){
        println(name)
    }

    var i = 100

    while (i < 100){
        i++
    }
    do {
        var x = 10
        x--
    }while (x > 0)

}