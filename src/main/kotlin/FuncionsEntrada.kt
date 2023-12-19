package Funcions
import java.util.Scanner

fun llegirInt(): Int {
    val scanner = Scanner(System.`in`)
    while (true) {
        if (scanner.hasNextInt()) {
            val number = scanner.nextInt()
            scanner.nextLine()  // Consumir el salto de línea
            return number
        } else {
            println("Si us plau, introdueix un número vàlid.")
            scanner.nextLine()  // Limpiar el buffer de entrada
        }
    }
}
fun llegirDouble(): Double {
    val scanner = Scanner(System.`in`)

    while (true) {
        if (scanner.hasNextDouble()) {
            val number = scanner.nextDouble()
            scanner.nextLine()  // Consumir el salto de línea
            return number
        } else {
            println("Si us plau, introdueix un número vàlid amb un decimal.")
            scanner.nextLine()  // Limpiar el buffer de entrada
        }
    }
}
fun llegirLong(): Long {
    val scanner = Scanner(System.`in`)

    while (true) {
        print("Introdueix un número llarg: ")

        if (scanner.hasNextLong()) {
            val number = scanner.nextLong()
            scanner.nextLine()  // Consumir el salto de línea
            return number
        } else {
            println("Si us plau, introdueix un número llarg vàlid.")
            scanner.nextLine()  // Limpiar el buffer de entrada
        }
    }
}
fun llegirString():String{
    var string = readln()
    return string
}