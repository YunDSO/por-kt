fun main(){

    /*6- Escrever um programa que receba vários números inteiros no teclado.
    E no final imprimir a média dos números múltiplos de 3. Para sair digitar
    0(zero).(DO...WHILE)*/

    var soma = 0
    var cont = 0
    var media = 0

    do{
        println("Digite um número: ")
        var num = readln().toInt()

        if(num % 3 == 0 && num != 0){
            cont++
            soma = soma + num
            media = soma / cont
        }

    }while(num != 0)

        println("A média dos números multiplos de 3 é: $media")
}