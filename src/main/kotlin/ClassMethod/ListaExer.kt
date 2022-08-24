package ClassesObjetos

import ClassMethod.ClienteNovo

/*1. Cria uma Classe Cliente, contendo os atributos encapsulados, um
construtor padrão
nome (String), endereço (String), telefone (String), listaDeCompras
(mutableListOf<Strings>()).
A classe precisará de métodos para adicionar, remover e listar os itens do
atributo listaDeCompras.
Crie um método para verificar o nome ao inicializar a classe e, caso esteja
vazio, jogue uma exceção. Ao instanciar a classe cliente na função main(),não
esquecer de colocar dentro de um bloco try catch*/

fun main(){

        println("Digite seu nome: ")
        var nome = readln()

        println("Digite seu endereco: ")
        var endereco = readln()

        println("Digite seu telefone: ")
        var telefone = readln().toLong()

        var clientenovo1 = ClienteNovo(
        nome , endereco , telefone


    )

    while (true) {

        println("|     PROMOÇÃO CHURRAS CAMPEÃO |"+"\n" +
        "Na compra de qualquer bebida ganhe 1kg de Linguiça")
        println("| 1 - Exibir itens disponíveis |")
        println("| 2 - Consultar dados |")
        println("| 3 - Remover itens   |")
        println("| 4 - Adicionar itens |")
        println("| 5 - Exibir itens    |")
        println("| 6   Sair            |")

        print("Opção: ")

        when (readln().toInt()) {

            1 -> clientenovo1.exibirItensOn()
            2 -> clientenovo1.dados()
            3 -> clientenovo1.removeritens()
            4 -> clientenovo1.adicionaritens()
            5 -> clientenovo1.exibir()
            6 -> break
        }
    }
}
































