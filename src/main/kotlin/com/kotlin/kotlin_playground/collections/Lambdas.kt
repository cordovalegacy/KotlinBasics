package com.kotlin.kotlin_playground.collections

//this is how you can define a lambda in the parameter
fun calculate(x: Int, y: Int, operation: (x:Int, y:Int) -> Int) : Int {
    return operation(x, y)
}

fun main() {
    //a lambda is a quicker way to write a simple data transformation function
    val addLambda = { x:Int, y:Int -> x+y }

    val result = addLambda(2, 3)
    println("RESULT: $result")

    val calculation = calculate(10, 5, {a, b -> a * b})
    println("CALCULATION IS $calculation")
}