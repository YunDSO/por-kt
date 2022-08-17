fun main() {

    /*2- Ler 10 números e imprimir quantos são pares e quantos são
    ímpares. (FOR)
     */

    var contp: Int = 0
    var conti: Int = 0

    for (num in 1..10) {

        println("Digite os números: ")
        var n = readln().toInt()

        if (n % 2 == 0) {
            contp++

        } else{
            conti++

        }

    }
        println("Esses números são pares: $contp")
        println("Esses números são ímpares: $conti")

    }










