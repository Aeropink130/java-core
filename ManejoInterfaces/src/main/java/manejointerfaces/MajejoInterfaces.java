package manejointerfaces;

import datos.*;

public class MajejoInterfaces {
    public static void main(String[] args) {
        
        AccesoDatos datos = new ImplementacionOracle();
        datos.insertar();
        datos.listar();
        
        datos = new ImplementacionMySQL();
        datos.insertar();
        datos.listar();
        
        System.out.println(AccesoDatos.MAX_REGISTROS);
    }
}
