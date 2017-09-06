# **Kotlin introduction**

Kotlin is a language that targets JVM and Javascript and it was released in feb 2016. 

- Statically Typed Language
- Inspired by Java, Scala, C# and Groovy
- Targets
  - JVM
  - JavaScript
  - Under progress (Native)
- Industrial purpose language
- Any type of application like
  - Web, Desktop, Server-side
- Deep Android adoption
- Gradle has adopted it for its scripting and plugins
- Similarity to other language allows quick ramp-up time
- Interoperability allows gradual adoption:
  - Advantage of this can allow developet to mix and match the java code with kotlin.
- Kotlin 1.0 released in feb 2016 
- Many companies including Amex(American Express), Netflix, and NBC News Digital are using kotlin




***Introduction to the JAVA VIRTUAL MACHINE A.K.A JVM***

In simple words JVM is an abstract machine that helps in executing java applications.

**JVM** composed by

|   Specifications    |
| :-----------------: |
| **Implementations** |
|    **Instances**    |

- Single specification, multiple implementations (OpenJDK most common).
- An instance is what runs a java application.
- Applications compiled to Bytecode
- Interms of running applications we have two facilities **JRE** and **JDK**

**Languages on the JVM**

- Truly polyglot ecosystem 
- All languages either compiled to bytecode (or Transpile to Java first)
- Kotlin, Scala, ceylon, Clojure, Frege

**KOTLIN and JAVA**

- Kotlin and Java are 100% interoperable 
- You can call java from Kotlin and vice versa
- You can use java library.

**Installing the Tools**

To get up and running you need the following tools.

- JDK 6/7/8 if you are targetting android try JDK 6 

- Kotlin compiler 

- IDE intelliJ IDEA ultimate edition or Community edition

  [Kotlin official download Link](https://kotlinlang.org/)

**The KOTLIN REPL**

REPL stands for **READ, EVALUATE, PRINT, LOOP**, Interactive way in which we can work with Kotlin programs. 

If you have Kotlin compiler installed In commandline type kotlinc for REPL to start working for you. you can start interactive REPL and start coding as you wish pretty straight forward.

You have two ways to use the REPL you can use your terminal and intelliJ IDE for starting to the REPL. 

**Kotlin with IntelliJ IDEA**

Download community edition IntelliJ IDEA its free and lets get started on building awesome Kotlin projects. 

**Conventions used with Kotlin and Summary**

Most of the programming syntax follows the Java convention if you are not familiar with the conventions lets go over them again. 

- Follows the Java coding conventions
- Lower camelCase for names
- Types in Uppercase
- Methods and Properties Lower camelCase
- Packages following reverse notation
  - Multiple classes per file allowed
  - Package does not have to match the folder names

**SUMMARY**

- Kotlin is a language that targets the JVM and Javascript 
- On the JVM it generates bytecode
- Fully interoperable with Java 
- The release was on Feb 2016 
- 1.1 release was on autumn 2016

# Declaring Variables in Kotlin 

Declaring a variable we will use a keyword **var** and for declaring functions **fun**. And data type is initialised after we write the name for functions and variables. consider the following function as example. it starts with **fun** keyword and function name, As arguments of the funtion we will pass the argument name first and later the argument type. 

```kotlin
fun main(args: Array<String>) {

}
```

To declare a variable 

```kotlin
    var streetNumber: Int
    var streetName: String = "MG Road"
```

One important aspect of kotlin is type **inference** when we are using a string variable even if we don't mention it's type kotlin finds out that you need a string for this operation. and it helps in cutting the amount of boiler plate code we write on acomplishing a simple task. 

```kotlin
    var streetName = "MG Road"
```

For creating immutable variables we will use the keyword **val** consider the following example. 

```kotlin
val zip = "Ashok stays in Bangalore"
```

 **val** cannot be re-assigned any other values. 

**IntelliJ IDEA** tells if you haven't used the variable more then once in your program to convert that in to val. 

# Working with Basic types in Kotlin 

In kotlin everything is an object, Int is an object in kotlin that defines the standards for numbers. Similarly we have **Byte**, **Long**, **FLoat**, **Double**, 

```kotlin
    val myInt: Int
```

```kotlin
    val myInt: Int

    val myLong = 10L
    val myFloat = 100F
    val myHex = 0x0F
    val myBinary = 0xb01

```

To work with binary types kotlin offers bitwise operators shift left and so on. 

**Strings**

```kotlin
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

```

One of the other feature that kotlin provides string interpolation. 

```kotlin
    val years = 10
    val message = " A decade is" + years

// String interpolation
    val messageYears = "A decade os $years years"
```

Within the string interpolation you can use the methods as shown below. 

```kotlin
    val name = "Ashok"
    val anotherMessage = "Length of his name is ${name.length}"
```

Kotlin offers many methods and functions libraries that works with string we will explore everything on the go. 

# Loops and ranges in Kotlin 

In this section lets look how kotlin will help in iterate through set of data. 

```kotlin
    for (a: Int in 1..100){
        //It will print from 1 to 100
        println(a)
    }
```

If we look at the above code block it has explicitly declared data type inside the for loop, even if remove it kotlin will understand that it is an integer and it will print the out put. 

```kotlin
    for (a in 1..100){
        //It will print from 1 to 100
        println(a)
    }

```

We can iterate through in many different ways as shown below. we use two dots to say from and to, if i want a list of numbers from 1 to 9000 i will do as shown below. 

`val numbers = 1..900` 

```kotlin
val numbers = 1..900
    for (a in numbers){
        println(a)
    }
```

When we need to do a reverse order loop we can use the **downTo** keyword inside the for loop and execute the program. 

```kotlin
// if want a reverse order loop
for (a in 100 downTo 1){
    println(a)
}
```

One more method that we can pattern the looping mechanism like as shown below using **step** key word. 

```kotlin
 // A little bit more complex loop
    for (b in 1000 downTo 1 step 10){
        println(b)
    }

```

You can declare a list of data and iterate through the data as shown below. 

```kotlin
 val Names = listOf("Ashok","Pavan", "Keerthi", "Thiru Windows", "Sanjay", "santosh")
    for (name in Names){
        println(name)
    }
```

**While**

```kotlin
  var i = 99

    while (i < 100){
        i++
    }
    do {
        var x = 10
        x--
    }while (x > 0)
```

# Conditional execution with If and When in Kotlin

Like any language kotlin offers conditionals with few differences. 

```kotlin
 //if conditionals
    var myString = "Not empty right now"
    if (myString != ""){
        println("Not empty")
    }else if (myString.startsWith("a")){
        println("Empty")
    }else {
        
    }
```

The above example is similar to conditional in most of the programming language. kotlin also helps in checking the expressional conditions as well.

**We can assign if conditions into a variable.** 

```kotlin
val result = if (myString != ""){
        println("Not empty")
    }else {
        println("Empty")
    }
    
    println(result)
```

When we compile this above logic we will see 

```kotlin
//output for val result = if (myString != ""){
 //       println("Not empty")
//    }

kotlin.Unit
```

Here **unit** is nothing but a void similar to other programming languages.  So when we say kotlin allows assigning conditions inside a if condition and we are experiencing a void output. Why is that ? 

The kotlin compiler reads the last line in the expression assigned to a variable. 

```kotlin
 val result = if (myString != "") {
        "Not empty"
    } else {
        "Empty"
    }
```

Now the above logic prints the following output. 

```kotlin
//output
Not empty

```

#### Kotlin also introduces a new condition unlike most of other programming languages. Called "**When**" condition. 

```kotlin
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
```

Notice that **When** condition is not limited to primitive datatypes it can compare any other custom data as well. It can be helpful in pattern matching.

# Packages and Imports in Kotlin & Summary of kotlin basics

So far we have understood the basic programming constructs in Kotlin, Now its time to understand how kotlin works with packages.

Packages in kotlin is completely similar to Java when we have hirarchy of packages and files IntelliJ or Android Studio will be able to import the package details through the files and functions  

```kotlin
package com.ashokslsk.kotlin.intro.basics

import com.ashokslsk.kotlin.intro.basics.utils.someUtility

/**
 * Created by ashok.kumar on 06/09/17.
 */
fun main(args: Array<String>) {
    println("Hello World")
    someUtility("Lovi")
}

import com.ashokslsk.kotlin.intro.basics.utils.someUtility

/**
 * Created by ashok.kumar on 06/09/17.
 */
fun main(args: Array<String>) {
    println("Hello World")
    someUtility("Lovi")
}

```

We can also have ***** Import which basically imports all the classes in the package. 

We can also have a named imports using **as** keyword.

```kotlin

import com.ashokslsk.kotlin.intro.basics.utils.someUtility as someOtherFunction

```

The above feature is great in terms of handling conflict. 

**To summarise what we seen so far** 

- Two ways to declare variables in kotlin 
  - **var** for mutable
  - **val** for immutable
- for loops can use ranges (1..100) for iteration
- if and when can be used in an expression



# Functions in Kotlin 

Kotlin treats functions as first class citizens. Most of programmers argues on whats the pure functional programming langauge or non functional programming language and they bring in  languages like haskel is the only pure functional programming language. As a fact any language that treats functions as first class is functional programming language, Perhaps for practical aspects kotlin is functional language. 

```kotlin
package com.ashokslsk.kotlin.intro.functions

/**
 * Created by ashok.kumar on 06/09/17.
 */

fun hello (){
    println("Hello World")
}

fun main(args: Array<String>) {
    hello()
}
```

**Functions with return types**

```kotlin
package com.ashokslsk.kotlin.intro.functions

/**
 * Created by ashok.kumar on 06/09/17.
 */

fun hello (): Unit{
    println("Hello World")
}

fun main(args: Array<String>) {
    hello()
}
```

Here in the above example **Unit** is little bit of different from plain **void** type in other languages. It is an object that returns string. 

We can write custom excetion methods as shown below. 

```kotlin
fun throwingException(): Nothing {
    throw Exception("Throwing exception")
}
```

 Say if we want to create a function that returns some value.  

```kotlin
fun returnsFour(): Int {
    return 4
}

fun main(args: Array<String>) {
    hello()
    val integerValue  = returnsFour()
    println(integerValue)

```

```kotlin
//Output
4
```

