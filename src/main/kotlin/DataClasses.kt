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
val greething: (String) -> String =  {
    "hello $it"
}
fun printName(value: String, name: (String) -> String){
    println(name(value))
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
    println(greething("AMR"))
    printName("Bhum"){
        val double = it + it
        "my name is $double"
    }
    val senin = "senin".firstAndLast()
    val first = senin["first"]
    val last = senin["last"]
    println("huruf pertama \"$first\" dan huruf terakhir \"$last\"")
    val double = 10.double
    println(double)

    val namaku = StringBuilder()
    namaku.apply {
        append("Ari ")
        append("Muhammad ")
        append("Rizal")
    }
    println(namaku)
    val ganjil = 1..99 step 2
    val acak = ganjil.take(ganjil.last).random()
    println( acak)
    val genap = (1..100 ).filter { it % 2 == 0 }
    println(genap.random())
    val userTank1 = UserTank("AMR")
    userTank1.printName()
}

class UserTank(val name: String){
    fun printName(){
        println("my name is $name")
    }
}

fun String.firstAndLast(): Map<String, Char>{
    return mapOf(
        "first" to first(), "last" to last()
    )
}

val Int.double: Int
    get() = this * 2