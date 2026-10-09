class Ejemplo {

    public static void main(String[] args) {
        System.out.println("=== ELIMINAR REPETIDOS ===");
        probarEliminar(new int[] { 1, 1, 2, 3, 3, 4 });
        probarEliminar(new int[] { 1, 1, 1 });
        probarEliminar(new int[] { 1, 2, 2 });
        probarEliminar(new int[] { 1, 2, 3 });
        probarEliminar(new int[] { 5, 5, 6, 6 });
        probarEliminar(new int[] {});

        System.out.println("\n=== FUSIONAR LISTAS ===");
        probarFusion(new int[] { 1, 4, 7 }, new int[] { 2, 3, 8, 9 });
        probarFusion(new int[] {}, new int[] { 2, 3 });
        probarFusion(new int[] {}, new int[] {});
        probarFusion(new int[] { 1, 1 }, new int[] { 1 });
    }

    static ListaEnlazada construirLista(int[] valores) {
        ListaEnlazada lista = new ListaEnlazada();
        for (int i = 0; i < valores.length; i++) {
            lista.insertarEnPosicion(i, valores[i]);
        }
        return lista;
    }
}