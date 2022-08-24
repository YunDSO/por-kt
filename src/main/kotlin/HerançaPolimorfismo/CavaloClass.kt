package HerançaPolimorfismo

 class CavaloClass(
    nome : String , idade : Int

): AnimalClass(nome, idade){

    override fun correr(){
        println("Galopando rapidamente")
    }

    override fun emitirSom() {
        println("IRIRRI PRRR")
    }
}
