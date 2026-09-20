public class Cola {
    private Cliente[] clientes;
    private final int CAPACIDAD_MAXIMA = 100;
    private int tamaño;
    private Console console;

    public Cola() {
        clientes = new Cliente[CAPACIDAD_MAXIMA];
        tamaño = 0;
        console = new Console();
    }

    public void añadirCliente(Cliente cliente) {
        if (tamaño < CAPACIDAD_MAXIMA) {
            clientes[tamaño] = cliente;
            tamaño = tamaño + 1;
        }
    }

    public boolean hayClientes() {
        return tamaño > 0;
    }

    public Cliente quitarCliente() {
        if (tamaño == 0) {
            return null;
        }
        Cliente cliente = clientes[0];
        for (int i = 0; i < tamaño - 1; i++) {
            clientes[i] = clientes[i + 1];
        }
        clientes[tamaño - 1] = null;
        tamaño = tamaño - 1;
        return cliente;
    }

    public int obtenerCantidadPersonasEnCola() {
        return tamaño;
    }

    public Cliente primero() {
        if (tamaño == 0) {
            return null;
        }
        return clientes[0];
    }

    public void mostrar() {
        for (int i = 0; i < tamaño; i++) {
            clientes[i].mostrar();
        }
        console.writeln();
    }
}