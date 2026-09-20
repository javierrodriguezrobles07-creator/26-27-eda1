public class CajaExpress extends Caja {

    public CajaExpress(int numero) {
        super(numero);
    }

    @Override
    public boolean puedeAtender(Cliente cliente) {
        return cliente.obtenerItems() <= 10;
    }
}