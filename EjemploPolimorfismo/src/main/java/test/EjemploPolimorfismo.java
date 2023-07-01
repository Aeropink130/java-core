package test;

import ejemplopolimorfismo.Empleado;
import ejemplopolimorfismo.Gerente;

public class EjemploPolimorfismo {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Pepa", 1000);
        imprimirDetalles(empleado);
        
        Gerente gerente = new Gerente("Papaya", 2000, "Finanzas");
        imprimirDetalles(gerente);
    }
    
    public static void imprimirDetalles(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
        
    }
}
