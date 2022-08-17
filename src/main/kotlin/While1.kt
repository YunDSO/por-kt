fun main(){

    /*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas
    com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa
    termina quando idade for =-99. (WHILE)*/

    var cont20 = 0
    var cont50 = 0

    while(true){
        println("Digite sua idade: ")
        var idade = readln().toInt()

        if(idade in 1..20){
            cont20++
        }else if(idade > 50){
            cont50++
        }
        if(idade == -99){
            break
        }
    }
        println("Pessoas com menos de 21 anos: $cont20")
        println("Pessoas com mais de 50 anos: $cont50")
}