package com.ashokslsk.kotlin.intro.basics

/**
 * Created by ashok.kumar on 25/06/17.
 */

fun main(args: Array<String>) {

    var streetNumber: Int
    var streetName: String = "MG Road"

    val zip = "Ashok stays in Bangalore"

    println(streetName + zip)

    //Int is an object in kotlin
    val myInt: Int

    val myLong = 10L
    val myFloat = 100F
    val myHex = 0x0F
    val myBinary = 0xb01


    //String
    val myChar = 'A'
    val myString = "Android rocks with this new language"
    val escapeCharacters = "A new line \n"
    val rawString = "Hello"+ "Ashok this is second line"+"A third line"

    val multipleLines = """
                This is a string
                that has multiple lines
                and kotlin knows
                how to read it
"""

    val years = 10
//Instead of doing as shown below
    val message = " A decade is" + years

    val messageYears = "A decade os $years years"

    val name = "Ashok"
    val anotherMessage = "Length of his name is ${name.length}"


}