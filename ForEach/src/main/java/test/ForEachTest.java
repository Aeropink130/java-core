package test;

import entidad.Persona;

public class ForEachTest {
    public static void main(String[] args) {
        int edades[] = {15,20,41,50};
        for(int edad : edades){
            System.out.println("edad = " + edad);
        }
        
        Persona personas[] = {new Persona("Juana"), new Persona("Banana")};
        System.out.println("");
        for(Persona persona : personas){
            System.out.println("persona = " + persona);
        }
    }
}
