fun main() {

    var resultado: Int = 0

    println("Digite um numero: ")
    var num1: Int = readln().toInt()

    println("Digite outro numero: ")
    val num2: Int = readln().toInt()

    resultado = num1 + num2

    if (resultado % 2 == 0) {

        println("a soma dos dois numero é: " + resultado + " e o numero é Par")
    } else {

        println("a soma dos dois numero é: " + resultado + " e o numero é Ímpar")
    }

}