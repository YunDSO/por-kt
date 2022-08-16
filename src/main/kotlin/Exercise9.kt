@file:JvmName("Exercise8Kt")

import kotlin.math.sqrt

fun main(){

    /*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

    print("Digite um numero: ")
    val num = readln().toInt()

    if (num % 2 == 0 ) {
        println("O numero digitado é par!!")
        var rq : Double = sqrt(num.toDouble())
        print("A raiz quadrada de $num é: $rq")
    } else {
        println("O numero digitado é ímpar")
        var eq = num * num
        println("Esse numero elevado ao quadrado é: $eq ")
    }
}




