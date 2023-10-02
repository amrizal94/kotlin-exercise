fun getName(
    name: String = "anonymous",
    nickName: String = "anonymous"
): String{
    if (name == "anonymous" || nickName == "anonymous") return "anonymous"
    return "my name is $name, nick name in game is $nickName"
}

fun main() {
    println(getName())
    println(getName("Emon"))
    println(getName(nickName = "AMR"))
    println(getName(nickName = "AMR", name = "Ari"))
}