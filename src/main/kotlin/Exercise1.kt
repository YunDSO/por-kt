fun main() {

    /* Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma
    for maior que 100, caso contrário imprimi-la com o valor zero. */

    println("Qual o valor de N: ")
    var N: Int = readln().toInt()


    if(N > 100) {
        println("valor de N é: " + N)
    }
    else{
        N=0
        println("O valor digitado é igual a: " + N)
    }
}