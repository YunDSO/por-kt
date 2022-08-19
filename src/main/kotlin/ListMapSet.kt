
    var lista = mutableListOf<String>()

    fun main() {

    /*Crie uma um programa para trabalhar com estoque de uma loja,
    o programa deverá trabalhar com Collection do tipo List do Java
    para manipular os dados desse estoque, o programa deverá atender as
    seguintes funcionalidades:

    Armazenar dados da List
    Remover dados da list;
    Atualizar dados da list.
    Apresentar todos os dados da list.*/

    while (true) {

        println("| 1 - Adicionar ao carrinho |")
        println("| 2 - Remover do carrinho |")
        println("| 3 - Atualizar carrinho |")
        println("| 4 - Exibir carrinho |")
        println("| 5 - Sair |")
        println()

        print("Opção: ")

        when (readln().toInt()) {

            1 -> adicionarcarrinho()
            2 -> removercarrinho()
            3 -> atualizarcarrinho()
            4 -> exibircarrinho()
            5 -> break
        }
    }
}






























    fun adicionarcarrinho(){
        println("Digite um produto: ")
        var produto = readln()

        if(produto != ""){
        lista.add(produto)
        print("Produto adicionado com sucesso!")
    }else{
        println("Produto inválido")
    }
    }

    fun removercarrinho(){
        print("digite um produto para remover: ")
        var remover = readln()

        if(lista.contains(remover)){
            lista.remove(remover)
            println("produto ${remover} excluído com sucesso")
        }else{
            print("Produto inválido!")
        }

    }

    fun atualizarcarrinho() {
        print("Digite o produto para atualizar: ")
        var atualizar = readln()

        if (lista.contains(atualizar)) {
            var posicao = lista.indexOf(atualizar)
            print("Digite um novo produto para adicionar: ")
            lista[posicao] = readln()
        }
    }

    fun exibircarrinho(){
        println("Produtos no carrinho: $lista")
    }