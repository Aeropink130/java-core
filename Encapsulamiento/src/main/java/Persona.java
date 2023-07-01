
public class Persona {
    
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public boolean isEliminado() {
        return this.eliminado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
//    public String toString(){
//        return "nombre: " + nombre + ", sueldo: " + sueldo + ", eliminado: " + eliminado;
//    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sueldo=" + sueldo + ", eliminado=" + eliminado + '}';
    }
    
    
    
}
