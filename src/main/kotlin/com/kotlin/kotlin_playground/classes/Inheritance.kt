package com.kotlin.kotlin_playground.classes

//open modifier allows for extending this class
open class User(val name: String){

    //in order to override this method, must use open
    open fun login(){
        println("Testing methods within inheritance")
    }

}

//the colon is how we extend a class
class Student(name: String): User(name)

class Instructor(name: String): User(name)

class Admin(name: String): User(name){
    var isLoggedIn: Boolean = false
    //this method had the same signature as the parent login method, so we overrode it
    override fun login(){
        println("I have overridden the parent login method")
        isLoggedIn = true
    }

    //this is the equivalent to static methods (companion object)
    companion object {
        const val adminPassword = "P@ssword123"
        fun adminLogin() = "P@ssword123"
    }
}

//need fun main to run the code
fun main(){

    val student = Student("George")
    println(student.name)
    student.login()

    val instructor = Instructor("Ken")
    println(instructor.name)

    val admin = Admin("Dave")
    println(admin.isLoggedIn)
    admin.login()
    println(admin.isLoggedIn)

    //these are the equivalent to static methods
    println(Admin.adminLogin())
    println(Admin.adminPassword)





}