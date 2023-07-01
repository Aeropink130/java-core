
package learn.ejercicio_atletas;


public class Atleta 
{
    private String nombre;
    private int num;
    private float tiempo;

    public Atleta(String nombre, int num, float tiempo) {
        this.nombre = nombre;
        this.num = num;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNum() {
        return num;
    }

    public float getTiempo() {
        return tiempo;
    }
    
    public String mostrarDatos()
    {
        return "Nombre: "+nombre+" Numero: "+num+" Tiempo: "+tiempo;
    }
}
