package datos;

public interface AccesoDatos {
    public static final int MAX_REGISTROS = 10;
    
    public abstract void insertar();
    
    public abstract void listar();
    
}
