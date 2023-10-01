class User(val name: String, val age: Byte)
class Users(val name: String, val age: Byte){
    override fun toString(): String {
        return "Users(name=$name, age=$age)"
    }
}

data class DataUser(val name: String, val age: Byte)

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
}