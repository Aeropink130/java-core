package test;

import ejemploinstanceof.Empleado;
import ejemploinstanceof.Gerente;

public class EjemploInstanceOf {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Pepa", 1000);
        determinaTipo(empleado);
        
        Gerente gerente = new Gerente("Papaya", 2000, "Finanzas");
        determinaTipo(gerente);
    }
    
    public static void determinaTipo(Empleado empleado){
        
        if(empleado instanceof Gerente){
            Gerente gerente = (Gerente) empleado;
            System.out.println("departamento del gerente: " + gerente.getDepartamento());
            //System.out.println(((Gerente) empleado).getDepartamento());
        }
        
        else if(empleado instanceof Empleado){
            System.out.println("nombre de empleado: " + empleado.getNombre());
        }
        
        else if(empleado instanceof Object){
            System.out.println("empleado = " + empleado.toString());
        }
        
    }
}
