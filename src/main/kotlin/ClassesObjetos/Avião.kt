package ClassesObjetos

fun main(){

    /*2) Crie uma classe avião e apresente os atributos e métodos referentes
    esta classe, em seguida crie um objeto avião, defina as instancias deste
    objeto e apresente as informações deste objeto no console.*/

    var aviao1 = aviao(
        "Boeing 777",
        "Qatar Airways",
        368
    )

    aviao1.destino= "Dubai"

    println(aviao1.modelo)
    println(aviao1.empresa)
    println(aviao1.capacidade)
    println(aviao1.destino)
}











