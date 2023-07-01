package genericos;

public class ClaseGenerica<T> {
    //definimos la variable de tipo generico
    T objeto;
    
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
}
}
