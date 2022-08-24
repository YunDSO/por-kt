package HerançaPolimorfismo

 class PreguicaClass(
    nome : String , idade : Int

): AnimalClass(nome,idade){

    override fun correr() {
        println("Engatinhando devagar")
    }

    override fun emitirSom() {
        println("AaAaAaAaAaAaAa")
    }

    override fun subirEmArvores() {
        println("PAKOUR")
    }
}
