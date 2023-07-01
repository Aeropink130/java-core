
package mundopc;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;
    
    public Orden(){
        this.idOrden = ++contadorOrdenes;
        computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < MAX_COMPUTADORAS){
            computadoras[contadorComputadoras++] = computadora;
        }
        else{
            System.out.println("Se alcanzo el numero maximo de computadoras: " + MAX_COMPUTADORAS);
        }
    }
    
    public double obtenerTotal(){
        double total = 0;
        for (int i = 0; i < contadorComputadoras; i++) {
            Computadora computadora = this.computadoras[i];
            total += computadora.getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("La orden #" + this.idOrden);
        System.out.println("Total de la orden $" + obtenerTotal());
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println("Computadora " + i + ": " + computadoras[i]);
        }
    }
    
}
