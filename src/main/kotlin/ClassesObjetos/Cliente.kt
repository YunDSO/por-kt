package ClassesObjetos
fun main() {

    /*1) Crie uma classe cliente e apresente os atributos e métodos referentes
    esta classe, em seguida crie um objeto cliente, defina as instancias deste
    objeto e apresente as informações deste objeto no console.*/

    var cliente1 = cliente(
        "Carlão",
        38,
        "SP"
    )

    cliente1.comidap = "Cogumelo"

    println(cliente1.nome)
    println(cliente1.idade)
    println(cliente1.cidade)
    println(cliente1.comidap)
}

