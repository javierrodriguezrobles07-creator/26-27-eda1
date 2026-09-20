public class Caja {
    private int numero;
    private Cliente cliente;
    private int itemsVendidos;
    private int personasAtendidas;
    private int itemsRestantes;
    private Console console;

    public Caja(int numero) {
        this.numero = numero;
        this.cliente = null;
        this.itemsVendidos = 0;
        this.personasAtendidas = 0;
        this.itemsRestantes = 0;
        this.console = new Console();
    }
}