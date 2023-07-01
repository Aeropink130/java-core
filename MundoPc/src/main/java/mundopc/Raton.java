package mundopc;

public class Raton extends DispositivoEntrada {
    
    private int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca, double precio) {
        super(tipoEntrada, marca, precio);
        this.idRaton = ++contadorRatones;
    }

    @Override
    public String toString() {
        return super.toString() + "Raton{" + "idRaton=" + idRaton + '}';
    }
    
}
