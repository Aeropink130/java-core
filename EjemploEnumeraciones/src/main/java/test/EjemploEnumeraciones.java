package test;

import enumeraciones.*;

public class EjemploEnumeraciones {
    public static void main(String[] args) {
        //desplegamos los valores de la enumeracione
        System.out.println("Valor 1: " + Dias.LUNES);
        System.out.println("Valor 2: " + Dias.MARTES);
        
        //utilizamos la enumeracion de paises
        System.out.println("Continente no. 4: " + Continenetes.AMERICA);
        System.out.println("Accedemos al numero de paises del continente 4: " 
                + Continenetes.AMERICA.getPaises());
        
        System.out.println("Continente no. 1: " + Continenetes.AFRICA);
        System.out.println("Accedemos al numero de paises del continente 1: " 
                + Continenetes.AFRICA.getPaises());
        
        indicarDia(Dias.LUNES);
    }
    
    private static void indicarDia(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
                
        }
    }
}
