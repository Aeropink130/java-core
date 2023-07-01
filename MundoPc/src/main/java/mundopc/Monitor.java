
package mundopc;

public class Monitor {
    
    private int idMonitor;
    private String marca;
    private double tamano;
    private static int contadorMonitores;
    private double precio;
    
    private Monitor (){
        this.idMonitor = ++contadorMonitores;
    }
    
    public Monitor (String marca, double tamano, double precio){
        this();
        this.marca = marca;
        this.tamano = tamano;
        this.precio = precio;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamano=" + tamano + '}';
    }
    
    
    
}
