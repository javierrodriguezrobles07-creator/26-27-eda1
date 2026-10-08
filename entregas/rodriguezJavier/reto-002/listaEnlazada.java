class ListaEnlazada {
    private Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    public void insertarEnPosicion(int posicion, int valor) {
        Nodo dummy = new Nodo(-1);
        dummy.establecerSiguiente(cabeza);
        Nodo actual = dummy;
        int pasos = 0;
        while (actual.obtenerSiguiente() != null && pasos < posicion) {
            actual = actual.obtenerSiguiente();
            pasos = pasos + 1;
        }
        Nodo nuevoNodo = new Nodo(valor);
        nuevoNodo.establecerSiguiente(actual.obtenerSiguiente());
        actual.establecerSiguiente(nuevoNodo);
        cabeza = dummy.obtenerSiguiente();
    }

    public void imprimirLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.obtenerValor() + " -> ");
            actual = actual.obtenerSiguiente();
        }
        System.out.println("null");
    }
}