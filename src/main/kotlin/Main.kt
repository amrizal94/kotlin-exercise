import java.util.*

fun main() {
    val name = "rizal"
    println("my name is $name")
    val umur: Int = 29
    var grade: Char = 'A'
    val phi: Double = 3.14
    val isMale: Boolean = true
    val myName = name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    println("my name is $myName and my old is $umur years old")
    println("First character on $myName is " + myName[0])
    println("Vocal " + grade++)
    println("Vocal " + grade++)
    println("Vocal " + grade++)
    println("Vocal " + grade++)
    grade--
    println("Vocal $grade")
    for (char in myName){
        print("$char ")
    }
    val lirik = """
        Kudune kowe ngerti
        Tresnoku nomer siji
        Penak e leh mu blenjani janji
        Kowe tego nglarani
    """.trimIndent()
    println(lirik)
    val user = setUser("Ari", 19)
    println(user)
    val office: String
    val openHours = 7
    val now = (1..20).random()
    office = if (now in 8..19) {
    "office is open, now is $now o'clock"
    }else if (now == 20){
        "several minute office will be close, now is $now o'clock"
    }else if (now == 7){
        "several minute office will be open, now is $now o'clock"
    }else{
        "office is closed, now is $now o'clock"
    }
    println(office)
    val maxInt = Int.MAX_VALUE
    val overRangeInt = maxInt + 1
    println(maxInt)
    println(overRangeInt)
    val intArray = intArrayOf(1,3,5,7)
    intArray[2] = 11
    println(intArray[2])
    val text: String? = null
    val textLenght = text?.length ?: 7
    println(text?.length)
    println(text)
    println("Office ${if (now in 9..17)"is Open" else "is close"}")
    val colorBlue = Color.Blue
    val color = Color.entries.random()


    when(color){
        Color.White -> println("the color you pick is White")
        Color.Green -> println("the color you pick is Green")
        Color.Red -> println("the color you pick is Red")
        Color.Blue -> println("the color you pick is Blue")
        else -> {
            println("another color")
            println("another is missing")
        }
    }

    var huruf = 'A'
    do {
        println(huruf)
        huruf++
    }while (huruf <='F')
    println(huruf.code)

    val listOfInt = listOf(1,2,3,4,null,6,null,8,9,10)
    for (i in listOfInt){
        if (i == null) break
        print(i)
    }
}

fun setUser(name: String, age: Number): String {
    return "Your name is $name, and you $age years old"
}

enum class Color(val value: Int){
    Blue(0x0000FF),
    Green(0x00FF00),
    Red(0xFF0000),
    White(0xFFFFFF)
}
