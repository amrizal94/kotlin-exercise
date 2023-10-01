class User(val name: String, val age: Byte)
class Users(val name: String, val age: Byte){
    override fun toString(): String {
        return "Users(name=$name, age=$age)"
    }
}

data class DataUser(val name: String, val age: Byte)
data class DataUserIntro(val name: String, val age: Byte){
    fun intro(): Unit {
        println("My name $name, I am $age years old")
    }
}

fun main() {
    val user1 = User("Umam", 17)
    val user2 = Users("Umam", 17)
    val dataUser1 = DataUser("Umam", 17)
    val user3 = dataUser1.copy()
    val user4 = dataUser1.copy(name = "Ari")
    println(user3)
    println(user4)
    println(user1)
    println(user2)
    println(dataUser1)
    val (name, age) = user4
    println("my name is $name, i am $age years age")
    val user5 = DataUserIntro(name, age)
    user5.intro()
}