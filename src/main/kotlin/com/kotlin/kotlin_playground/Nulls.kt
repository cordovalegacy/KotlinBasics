package com.kotlin.kotlin_playground

data class Movie(
    val id: Int?,
    val name: String
)

fun main(){
    //adding a question mark at the end of the type will make nullable
    //when calling a variable that may be null, you can use optional chaining as a guard
    //you can add a default value with the elvis operator ?: (equivalent to js :(else))
    var nameNullable: String? = null
    nameNullable = "The Last Samurai"
    println("Value is ${nameNullable.length}")

    var name: String? = null
    val movie = Movie(null, "The Last Samurai")
    //just like js, you can have a non-null value assertion
    println(movie.id!!)
    saveMovie(movie)
}

fun saveMovie(movie: Movie): Movie{
        return movie.copy(id=1)
}