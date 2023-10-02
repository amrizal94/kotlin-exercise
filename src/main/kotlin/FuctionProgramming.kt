fun getName(
    name: String = "anonymous",
    nickName: String = "anonymous"
): String{
    if (name == "anonymous" || nickName == "anonymous") return "anonymous"
    return "my name is $name, nick name in game is $nickName"
}
fun sumNumbers(vararg number: Int):Int{
    return number.sum()
}
fun sumNumbersList(vararg numbers: List<Int>):Int{
    return numbers.sumOf {
        it.sum()
    }
}

fun main() {
    println(getName())
    println(getName("Emon"))
    println(getName(nickName = "AMR"))
    println(getName(nickName = "AMR", name = "Ari"))
    println(sumNumbers(1,2,3,4,5,6,7,8,9,10))
    println(sumNumbersList((1..10).toList()))
    println(sumNumbers(*(1..10).toList().toIntArray(),1,2,3,4,5,6,7,8,9,10))
}