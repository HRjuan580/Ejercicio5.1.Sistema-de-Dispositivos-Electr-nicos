class Lavadora: EncendidoApagado, DispositivoElectronico {

    private val encendida: Boolean = false

    override fun encender() {
        if (!encendida){
            encendida = true
            println("Lavadora encendida")
        } else {
            println("La lavadora ya esta encendida")
        }
    }

    override fun apagar() {
        if (encendida){
            encendida = false
            println("La lavadora esta apagada")
        }else {
            println("La lavadora ya esta apagada.")
        }
    }

    override fun reiniciar() {
        if (encendida){
            println("La lavadora se esta reiniciando...")
            apagar()
            encender()
        }else {
            println("No se puede reiniciar la lavadora, la lavadora esta apagada.")
        }
    }
}