interface EncendidoApagado {
    fun encender()
    fun apagar()
}

interface DispositivoElectronico {
    fun reiniciar()
}

interface Vehiculo {
    var motorEncendido: Boolean
    var kmHora: Int

    fun acelerar(incremento: Int)
    fun frenar(decremento: Int)
}