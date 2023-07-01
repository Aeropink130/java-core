
package mundopc;


public class Teclado extends DispositivoEntrada{
    
    private int idTeclado;
    private static int contadorteclados;
    
    
    public Teclado(String tipoEntrada, String marca, double precio) {
        super(tipoEntrada, marca, precio);
        this.idTeclado = ++contadorteclados;
    }

    @Override
    public String toString() {
        return super.toString() + "Teclado{" + "idTeclado=" + idTeclado + '}';
    }
    
    
}
