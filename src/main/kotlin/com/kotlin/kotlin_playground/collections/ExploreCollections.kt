package com.kotlin.kotlin_playground.collections

fun main(){
    val names = listOf("Alex", "Ben", "Chloe")
    println("LIST: $names")

    val namesMutableList = mutableListOf("Alex", "Ben", "Chloe")
    println("MUTABLE LIST #1: $namesMutableList")
    namesMutableList.add("Brendan")
    println("MUTABLE LIST #2: $namesMutableList")

    val set = setOf("Alex", "Ben", "Chloe")
    println("SET: $set")
    val mutableSet = mutableSetOf("Alex")
    mutableSet.add("Brendan")
    println("MUTABLE SET: $mutableSet")

    val nameAgeMap = mapOf("Brendan" to 28, "Charlie" to 11)
    println("MAP: $nameAgeMap")
    val nameAgeMapMutable = mutableMapOf("Brendan" to 28, "Charlie" to 11)
    nameAgeMapMutable["abc"] = 123
    println("MUTABLE MAP: $nameAgeMapMutable")


}