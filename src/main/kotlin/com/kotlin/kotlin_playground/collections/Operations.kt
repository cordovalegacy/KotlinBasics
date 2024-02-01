package com.kotlin.kotlin_playground.collections

data class Languages(
    val name: String,
    val yearsOld: Int,
    val strength: String,
    val weakness: String
)
//map and filter always return something
//forEach will just grab what you want from whatever is returned.
fun filterLanguages(languages: List<Languages>) {
    return languages
        .filter { it.name.equals("JavaScript", ignoreCase = true) }
        .forEach {
            println("Best Language: ${it.name}")
        }
}

fun mapLanguages(languages: List<Languages>) {
    val allLanguages = languages
        .map { "${it.name} - ${it.yearsOld}yrs - ${it.strength}" }
        .forEach {
            println("Language: $it")
        }
    return allLanguages
}

fun main(){
    val python = Languages("Python", 20, "Easy to read and write", "Complicated methods")
    val java = Languages("Java", 30, "Fast and Performant", "A lot of code for little effect")
    val javascript = Languages("JavaScript", 25, "Very flexible", "Too flexible")
    val kotlin = Languages("Kotlin", 5, "Takes best of modern languages", "Cannot handle null values well")
    val languageList = listOf<Languages>(python, java, javascript, kotlin)
    val filteredLanguages = filterLanguages(languageList)
    val mappedLanguages = mapLanguages(languageList)
    println("All Languages: $mappedLanguages")
    println("Favorite Language: $filteredLanguages")
}