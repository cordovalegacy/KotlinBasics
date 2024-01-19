package com.kotlin.kotlin_playground.basics

fun main(){
    var phrase = "I am learning Kotlin"
    var time = 1

    println("Hello, $phrase! It will probably take me $time month. Better than taking ${phrase.length} months!")

    //this triple quotes syntax will let me create formatted paragraphs
    println("""
        Hello, $phrase!
        It will probably take me $time month.
        Better than taking ${phrase.length} months!
    """.trimIndent())

    val position = 1
    val medal = when(position){
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "No Medal"
    }
    println(medal)
}
