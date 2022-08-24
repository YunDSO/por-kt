package ClassMethod

class ClienteNovo(
    var nome : String,
    var endereco : String,
    var telefone : Long ,
){
    var listaDeCompras = (mutableListOf<String>())
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
    fun removeritens(){
        println("Digite o item para remover: ")
        var remover = readln()

        listaDeCompras.remove(remover)
    }
    fun adicionaritens(){
        println("Adicione um item: ")
        var adicionar = readln()

        listaDeCompras.add(adicionar)

        if(adicionar == "Gin" || adicionar == "Vodka"){
            println("PARABÉNS!! Você está participando" +
                    "da promoção e ganhou 1 kg de Linguiça")
            listaDeCompras.add("1 kg de Linguiça")
        }
    }
    fun exibir(){
        listaDeCompras.forEach(){
            println(it)
        }
    }
}
