package HerançaPolimorfismo

abstract class AnimalClass(
    var nome : String,
    var idade : Int,
){

    abstract fun correr()

    abstract fun emitirSom()

    open fun subirEmArvores(){

    }
}