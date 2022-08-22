package ClassesObjetos

class paciente(
    var nome : String,
    var doenca : String,
    var remedio : String,
    var dosesAoDia : Int
    ){
    var alergia = false

    constructor(
        nome : String,
        doenca  :String,
        remedio : String,
        dosesSoDia : Int,
        alergia : Boolean,
    ): this(
        nome, doenca, remedio, dosesSoDia
    ){
        this.alergia = true
    }
}
