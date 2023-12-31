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
    val colorRed = Color.RED
    val color = Color.entries.random()
    println(colorRed)
    println(colorRed.value.toString(16))
    println("Posisi warna $colorRed adalah ${colorRed.ordinal}")


    when(color){
        Color.WHITE -> println("the color you pick is White")
        Color.GREEN -> println("the color you pick is Green")
        Color.RED -> println("the color you pick is Red")
        Color.BLUE -> println("the color you pick is Blue")
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
    println()
    println(sum(2, 4*2))
    val stringOfValue = when (now){
        6 -> "value is 6"
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> "value is 8"
        else -> "value cannot be reached"
    }
    println(stringOfValue)
    val randomNum = (0..100).random()
    val workHours = 7..15
    when(randomNum){
        in workHours -> println("value in work Hours")
        !in workHours -> println("value outside of range")
        else -> println("value is undefined")
    }

    val registerNumber = when(val regis = (1..100).random()){
        in 1..50 -> {
            println(regis)
            50 * regis
        }
        in 51..100 -> {
            println(regis)
            100 * regis
        }
        else -> regis
    }
    println(registerNumber)
    println(registerNumber is Int)
    var genap = (2..100).random()
    if (genap % 2 == 1) genap++
    println(genap)

    val ganjil = 1..100 step 2
    ganjil.forEach(::println)
    ganjil.forEach {
        print("$it ")
    }
    val numRange = 1.rangeTo(10)
    numRange.forEachIndexed { index, i -> println("value $i, with index $index") }
    val numDown = 10.downTo(1)
    println()
    for ((index, value) in numDown.withIndex()) println("value $value with index $index")
    println(Random().nextInt(100))

    loopLuar@ for (i in 1..10){
        println("Loop Luar")
        for (j in 1..10){
            println("Loop dalam")
            if (j > 3)break@loopLuar
        }
    }

}

fun setUser(name: String, age: Number): String {
    return "Your name is $name, and you $age years old"
}

enum class Color(val value: Int){
    BLUE(0x0000FF),
    GREEN(0x00FF00),
    RED(0xFF0000),
    WHITE(0xFFFFFF)
}

fun sum (value1: Int, value2: Int) = value1 + value2
