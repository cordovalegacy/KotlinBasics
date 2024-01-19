package com.kotlin.kotlin_playground.basics

import javax.naming.InvalidNameException

var caseOptions = listOf("snake_case", "camelCase", "PascalCase", "kebab-case")

// Primary constructor
class OOP(
    val language: String,
    val initialCasing: String,
    var experience: Int = 0
) {
    // Custom setter for casing
    var casing = initialCasing
    set(value) {
        if (value !in caseOptions) {
            throw InvalidNameException("Not a valid casing option")
        } else {
            field = value
        }
    }
}

fun stacks() {
    var python = OOP("Python", caseOptions[0], 2)
    var kotlin = OOP("Kotlin", "${caseOptions[2]}/${caseOptions[1]}")
    var java = OOP("Java", "${caseOptions[2]}/${caseOptions[1]}", 1)
    var javascript = OOP("JavaScript", caseOptions[2], 3)
    kotlin.experience = 1
    kotlin.casing = caseOptions[1]

    val eachStack = listOf(python, kotlin, java, javascript)
    for (stack in eachStack) {
        println("${stack.language}, ${stack.casing}, ${stack.experience}")
    }
}

fun main() {
    stacks()
}
