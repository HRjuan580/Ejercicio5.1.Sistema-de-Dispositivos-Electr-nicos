class Coche: EncendidoApagado, Vehiculo {
    override var motorEncendido : Boolean = false
    override var kmHora: Int = 0


    override fun encender(){
        if (!motorEncendido){
            motorEncendido = true
            println("El coche esta encendido.")
        } else {
            println("El coche ya esta encendido")
        }
    }

    override fun apagar() {
        if(motorEncendido){
            motorEncendido = false
            println("El coche esta apagado.")
        }else{
            println("El coche ya esta apagado")
        }
    }

    override fun frenar(decremento: Int) {
        if (motorEncendido) {
            kmHora -= decremento
            if (kmHora < 0) kmHora = 0
            println("Frenando. Velocidad actual: $kmHora km/h")
        } else {
            println("No se puede frenar, el coche está apagado.")
        }
    }

    override fun acelerar(incremento : Int) {
        if(motorEncendido){
            kmHora += incremento
            println("El coche esta acelerando. Velocidad actual: $kmHora km/h")
        } else {
            println("No se puede acelear, el coche esta apagado")
        }
    }
}