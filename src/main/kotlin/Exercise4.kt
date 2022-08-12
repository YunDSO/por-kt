fun main(){

    /*João, homem de bem, comprou um microcomputador para controlar o rendimento diário
de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
ZERO. */

    var E: Int = 0
    var M: Int = 0

    println("Qual o peso dos tomates: ")
    var P: Int = readln().toInt()

    E = P - 50

    if(E > 0){

        M = E * 4

        println("por conta de excesso, multa de: R$ "  + M + " Pois estava acima de 50 quilos")
    }else{

        println("O valor total é o mesmo")
    }





    }

