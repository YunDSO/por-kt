fun main(){

    /*2 - Faça um programa em que o usuário digite o diâmetro
    de um círculo e calcule a área e o perímetro dele*/

    print("Qual o diâmetro do círculo?: ")
    var circulo = readln().toFloat()

    val raio = circulo / 2
    val area = 3.14 * (raio * raio)
    val perimetro = (2 * 3.14) * raio

    print("A área do círculo é:$area e o perímetro é: $perimetro")

}

