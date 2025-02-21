class Telefono: EncendidoApagado, DispositivoElectronico {
    private var encendido: Boolean = false

    override fun encender(){
        if(!encendido){
            encendido = true
            println("Telefono encendido.")
        } else {
            println("El telefono ya está  encendido")
        }
    }

    override fun apagar() {
        if (encendido){
            encendido = false
            println("Telefono apagado")
        } else {
            println("El telefono ya esta apagado.")
        }
    }

    override fun reiniciar(){
        if (encendido){
            println("Reiniciando el telefono...ç")
            apagar()
            encender()
        } else {
            println("Nose puede reiniciar, el telefono está apagado-")
        }
    }
}