public class CentroComercial {
    private Cola cola;
    private Caja[] cajas;
    private Console console;
    private boolean llegaClienteEsteMinuto;
    private final double PROBABILIDAD_LLEGADA = 0.6;
    private final double PROBABILIDAD_APERTURA = 0.4;

    public CentroComercial() {
        this.console = new Console();
        this.cola = new Cola();
        this.cajas = new Caja[5];
        for (int i = 0; i < cajas.length; i++) {
            cajas[i] = new Caja(i + 1);
        }
    }

    public void simular() {
        for (int minuto = 1; minuto <= 120; minuto++) {
            cola.avanzarMinuto();
            this.procesarLlegadaCliente(minuto);
            this.asignarClientesACajas();
            this.procesarAtencionCajas();
        }
    }

    private void procesarLlegadaCliente(int minuto) {
        llegaClienteEsteMinuto = Math.random() < PROBABILIDAD_LLEGADA;
        if (llegaClienteEsteMinuto) {
            Cliente nuevo = new Cliente(5, false, -1);
            cola.añadirCliente(nuevo);
        }
    }

    private void asignarClientesACajas() {
        for (int i = 0; i < cajas.length; i++) {
            if (cajas[i].estaLibre() && cola.hayClientes()) {
                Cliente siguiente = cola.quitarCliente();
                cajas[i].asignar(siguiente);
            }
        }
    }

    private void procesarAtencionCajas() {
        for (int i = 0; i < cajas.length; i++) {
            cajas[i].avanzarAtencion();
        }
    }
}