public class Tiempo {
    private int minutoActual;
    private final int MINUTOS_TOTALES = 120;

    public Tiempo() {
        this.minutoActual = 0;
    }

    public void avanzarMinuto() {
        this.minutoActual = this.minutoActual + 1;
    }

    public boolean haTerminado() {
        return this.minutoActual >= MINUTOS_TOTALES;
    }

    public int obtenerMinutoActual() {
        return this.minutoActual;
    }
}