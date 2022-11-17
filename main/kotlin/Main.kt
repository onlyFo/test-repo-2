package kotlin

fun main() {
    val x = 4
    val y = 7

    print(sum(x,y))
    print(minus(x,y))
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun minus(x: Int, y: Int): Int {
    return x - y
}