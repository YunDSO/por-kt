fun main(){

/*1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/

    println("Digite um número: ")
    var num1 = readln().toInt()

    println("Digite um número: ")
    var num2 = readln().toInt()

    println("Digite um número: ")
    var num3 = readln().toInt()

    if(num1 > num2 && num1 > num3){
        println("Este número é o maior:$num1")
    }else if(num2 > num1 && num2 > num3){
        println("Este número é maior:$num2")
    }else if(num3 > num1 && num3 > num2){
        println("Este número é maior:$num3")
    }



}