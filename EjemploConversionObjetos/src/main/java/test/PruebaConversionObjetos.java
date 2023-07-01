package test;

import ejemploconversionesobjetos.*;

public class PruebaConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Roy", 5000, TipoEscritura.CLASICO);
        //empleado.getTipoEscrituraEnTexto();
        
        System.out.println(empleado.obtenerDetalles());
        
        Escritor escritor  = (Escritor) empleado;
        System.out.println(escritor.getTipoEscrituraEnTexto());
        
        System.out.println(((Escritor) empleado).getTipoEscrituraEnTexto());
        
        empleado = new Gerente("Pancha", 4500, "Contaduria");
        System.out.println(((Gerente)empleado).getDepartamento());
        
        
    }
}
