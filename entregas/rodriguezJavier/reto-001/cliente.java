public class Cliente {
    private static int contadorGlobal = 1;
    
    private int id;
    private int tiempoEnFila;

    public Cliente() {
        this.id = contadorGlobal;
        contadorGlobal++;
        this.tiempoEnFila = 0;
    }

    public int getId() {
        return id;
    }

    public int getTiempoEnFila() {
        return tiempoEnFila;
    }

    public void aumentarTiempo() {
        this.tiempoEnFila = this.tiempoEnFila + 1;
    }
}