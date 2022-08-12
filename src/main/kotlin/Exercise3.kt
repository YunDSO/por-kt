fun main () {

    /* Desenvolver um sistema que efetue a soma de todos os números ímpares que são
múltiplos de três e que se encontram no conjunto dos números de 1 até 500. */

    var cont : Int = 0

    for (x in 0 until 501 step 3) {
        print("|" + x)

        if (x % 2 == 1) {
            cont = cont + x
        }
    }
    println()
    println(cont)
}