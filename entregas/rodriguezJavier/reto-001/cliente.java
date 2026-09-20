public class Cliente {
    private static int contadorGlobal = 1;
    
    private int id;
    private int tiempoEnFila;
    private int items;

    public Cliente(int items) {
        this.id = contadorGlobal;
        contadorGlobal++;
        this.tiempoEnFila = 0;
        this.items = items;
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

    public int obtenerItems() {
        return items;
    }
}