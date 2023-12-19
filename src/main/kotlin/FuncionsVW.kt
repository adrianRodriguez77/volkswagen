package Funcions

val RESET: String = "\u001b[0m"
val BLUE: String = "\u001b[0;34m"
val RED: String = "\u001b[0;31m"
val GREEN: String = "\u001b[0;32m"

/**
 * @author Adrián Rodríguez Vegas
 * @description función que calcula el precio base dependiendo del modelo
 * @param model, modelo de la frugoneta
 */
fun calcularPreuBase(model: String): Int {
    return if (model == "Camper Full Equip") {
        73490 + 20000  // Precio base original + 20000 si es Camper Full Equip
    } else {
        73490  // Precio base original
    }
}

/**
 * @author Adrían Rodríguez Vegas
 * @description función que calcula el precio dependiendo del estado de los neumaticos, si contiene portabicis y los años
 * @param preuBase, precio base de la furgo
 * @param km, kilometros de la furgoneta
 * @param anysFurgo, años de la furgoneta
 * @param portabicis, contiene portabicis
 * @return precio actual con equipamientos
 */
fun calcularPreuActual(preuBase: Int, km: Int, anysFurgo: Int, portabicis: Boolean): Int {
    var preuActual = preuBase

    // Restar 200 o 300 euros según el estado de los neumáticos
    when {
        km < 5000 -> preuActual
        km < 10000 -> preuActual - 200
        else -> preuActual - 300
    }

    // Sumar 250 euros si tiene portabicis
    if (portabicis) {
        preuActual += 250
    }

    // Aplicar la depreciación según los años y kilómetros
    if (anysFurgo in 6..10) {
        preuActual -= (km * 0.0002).toInt()
    } else if (anysFurgo > 10) {
        preuActual -= (km * 0.0004).toInt()
    }

    return preuActual
}

//Funciones de entrada
/**
 * @author Adrián Rodríguez Vegas
 * @description pide el nombre del usuario
 * @return nombre del usuario
 */
fun nomUsuari():String{
    val nom: String = llegirString()
    return nom
}

/**
 * @author Adrián Rodríguez Vegas
 * @description esta función da la bienvenida al usuario
 */
fun benvinguda(){
    print("Introdueix el teu nom: ")
    val nom = nomUsuari()
    println("Benvingut/da a "+BLUE+"VOLKSWAGEN,"+RESET+" $nom!")
    println()
    println(BLUE+"DADES DE LA TEVA VOLKSWAGEN"+ RESET)
}

/**
 * @author Adrián Rodríguez Vegas
 * @description función que pide al usuario el modelo de la furgoneta
 */
fun model(): String {
    print("Selecciona el model, Grand California o Camper Full Equip: ")
    return llegirString()
}
