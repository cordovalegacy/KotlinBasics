package com.kotlin.kotlin_playground.classes

object Authenticate {

    fun authenticate(email: String, password: String){
        println("User auth for $email")
    }

}

fun main(){
    Authenticate.authenticate("brendan.cordova55@gmail.com", "password123")
}