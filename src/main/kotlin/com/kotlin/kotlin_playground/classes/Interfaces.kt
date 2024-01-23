package com.kotlin.kotlin_playground.classes

interface UserRepo {
    fun getById(id: Int): User
    fun save(user: User): Int {
        return 1
    }
}

class AdminUserRepo: UserRepo{
    override fun getById(id: Int): User {
        return(Student("brendan"))
    }

    companion object {
        fun save(byId: Any): Any {
            println(byId)
            return byId
        }

        fun getById(i: Int): Any {
            println(i)
            return i
        }
    }


}

fun main(){
    val newUser = AdminUserRepo.save(AdminUserRepo.getById(1))
    println(newUser)
}