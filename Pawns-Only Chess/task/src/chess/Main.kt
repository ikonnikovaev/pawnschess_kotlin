package chess

fun printField() {
    val separator = "  +---+---+---+---+---+---+---+---+"
    val emptyRow = "|   |   |   |   |   |   |   |   |"
    val blackPawnsRow = "| B | B | B | B | B | B | B | B |"
    val whitePawnsRow = "| W | W | W | W | W | W | W | W |"
    val labels = "    a   b   c   d   e   f   g   h"


    println(separator)
    for (i in 8 downTo 1) {
        if (i == 7) {
            println("$i $blackPawnsRow")
        } else if (i == 2) {
            println("$i $whitePawnsRow")
        } else {
            println("$i $emptyRow")
        }
        println(separator)
    }

    println(labels)
}

fun main() {
    println("Pawns-Only Chess")
    println("First Player's name:")
    val firstName = readln()
    println("Second Player's name:")
    val secondName = readln()
    printField()
    var i = 0
    while (i >= 0) {
        if (i % 2 == 0) {
            println("$firstName's turn:")
        } else {
            println("$secondName's turn:")
        }
        val move = readln()
        val regex = "[a-h][1-8][a-h][1-8]".toRegex()
        if (move == "exit") {
            println("Bye")
            break
        }
        if (regex.matches(move)) {
            i += 1
        } else {
            println("Invalid Input")
        }
    }

}