fun main() {
    /*
    Uma empresa desenvolveu uma pesquisa para saber as características
    psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
    era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
    (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
    agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
    pessoas, calcule e mostre: (WHILE)
    número de pessoas calmas;
    número de mulheres nervosas;
    número de homens agressivos;
    número de outros calmos;
    número de pessoas nervosas com mais de 40 anos;
    número de pessoas calmas com menos de 18 anos.
    */
    var cont = 1
    var calmos = 0
    var mulheresNervosas = 0
    var homensAgressivos = 0
    var outroCalmo = 0
    var nervosoMais40 = 0
    var calmoMenos18 = 0

    while (cont <= 5) {
        cont++
        print("Digite sua idade: ")
        var idade = readln().toInt()

        println("================================")
        println("        Digite seu sexo:        ")
        println("1-Homem | 2-Mulher | 3-Outros...")
        print("R: ")
        var genero = readln().toInt()

        println("================================")
        println("   Como é sua personalidade     ")
        println("1-Calmo | 2-Nervoso | 3-Agressivo")
        print("R: ")
        var jeito = readln().toInt()

        println("=================================")

        if (jeito == 1) {
            calmos++
        }
        if (genero == 2 && jeito == 2) {
            mulheresNervosas++
        }
        if (genero == 1 && jeito == 3) {
            homensAgressivos++
        }
        if (genero == 3 && jeito == 1) {
            outroCalmo++
        }
        if (jeito == 2 && idade >= 40) {
            nervosoMais40++
        }
        if (jeito == 1 && idade <= 18) {
            calmoMenos18++
        }
    }
    println(
        "número de pessoas calmas: $calmos\n" +
                "    número de mulheres nervosas: $mulheresNervosas\n" +
                "    número de homens agressivos: $homensAgressivos\n" +
                "    número de outros calmos: $outroCalmo\n" +
                "    número de pessoas nervosas com mais de 40 anos: $nervosoMais40\n" +
                "    número de pessoas calmas com menos de 18 anos: $calmoMenos18"
    )
}







