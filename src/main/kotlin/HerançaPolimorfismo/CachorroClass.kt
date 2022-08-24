package HerançaPolimorfismo

class CachorroClass(
    nome: String, idade: Int


) : AnimalClass(nome, idade) {

    override fun correr() {
        println("Correndo ofegante")
    }

    override fun emitirSom() {
        println("AuAu")
    }

}














