package depressao

class ClienteNovo(
    var nome : String,
    var endereco : String,
    var telefone : Long ,
){
    private var listaDeCompras = (mutableListOf<String>())

    var exibir = listaDeCompras

    fun dados(){
        println(nome)
        println(endereco)
        println(telefone)
    }
    fun exibirItensOn() {
        println(
            " Banana, Maçã , Laranja , Arroz ," +
                    " Ovos , Picanha , Frango , Gin , " +
                    " Vodka , Sorvete , Fini , Bombom "
        )
    }
    fun removeritens(remover : String){
        listaDeCompras.remove(remover)
    }
    fun adicionaritens(adicionar : String) {
        listaDeCompras.add(adicionar)
    }
    fun exibir(){
        listaDeCompras.forEach(){
            println(it)
        }
    }
}
