fun main() {

    /*2- Faça um programa que entre com três números e coloque em ordem crescente.*/

    println("Digite um número: ")
    var num1 = readln().toInt()

    println("Digite um número: ")
    var num2 = readln().toInt()

    println("Digite um número: ")
    var num3 = readln().toInt()

    if (num1 < num2 && num2 < num3) {
        println("Este é a sequência:$num1 ; $num2 ; $num3")
    } else if (num1 < num2 && num2 > num3) {
        println("Este é a sequência:$num1 ; $num3 ; $num2")
    } else if (num1 > num2 && num2 > num3) {
        println("Este é a sequência:$num3 ; $num2 ; $num1")
    } else if (num1 < num2 && num3 < num1) {
        println("Este é a sequência:$num3 ; $num1 ; $num2")
    } else if (num2 < num1 && num1 < num3) {
        println("Este é a sequência:$num2 ; $num1 ; $num3")
    } else if (num2 < num3 && num3 < num1) {
        println("Este é a sequência:$num2 ; $num3 ; $num1")
    }
}