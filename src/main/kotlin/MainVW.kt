package Funcions

fun main() {
    benvinguda()
    val model = model()
    val preuBase = calcularPreuBase(model)

    print("Quilómetres de la furgo: ")
    val km = llegirInt()

    print("Anys de la furgo: ")
    val anysFurgo = llegirInt()

    print("La furgo té portabicis? (S/n): ")
    val portaBicis = readln() == "S"

    val preuFinal = calcularPreuActual(preuBase, km, anysFurgo, portaBicis)
    println()
    println("· Preu Base Original: $GREEN${preuBase.toDouble()}€$RESET")
    println("· La teva $BLUE$model$RESET té un preu de $GREEN${preuFinal.toDouble()}€.$RESET")
}