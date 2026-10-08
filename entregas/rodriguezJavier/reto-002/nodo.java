class Nodo {
    private int valor;
    private Nodo siguiente;

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public int obtenerValor() {
        return this.valor;
    }

    public Nodo obtenerSiguiente() {
        return this.siguiente;
    }
}