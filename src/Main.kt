fun main() {
    val telefono = Telefono()
    telefono.encender()
    telefono.reiniciar()
    telefono.apagar()

    val lavadora = Lavadora()
    lavadora.encender()
    lavadora.reiniciar()
    lavadora.apagar()

    val coche = Coche()
    coche.encender()
    coche.acelerar(50)
    coche.frenar(20)
    coche.frenar(40)
    coche.apagar()
}