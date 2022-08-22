package ClassesObjetos

        fun main() {

            /*7) Crie uma classe paciente e apresente os atributos e métodos referentes
    esta classe, em seguida crie um objeto paciente, defina as instancias deste
    objeto e apresente as informações deste objeto no console.*/

            var paciente1 = paciente(
                "Pedro",
                "Bronquite",
                "Prednisona",
                2,
                true
            )

            println(paciente1.nome)
            println(paciente1.doenca)
            println(paciente1.remedio)
            println(paciente1.dosesAoDia)
            println(paciente1.alergia)

        }