package arreglos;

public class EjemploArreglos {
    
    public static void main(String[] args) {
        
        // declaracion variable tipo de tipo arreglo
        int edades[];
        
        // instanciar objeto arreglo de int
        edades = new int[3];
        
        // inicializar los valores del arreglo
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;
        
        System.out.println("Arreglo de enteros indice 0: " + edades[0]);
        System.out.println("Arreglo de enteros indice 1: " + edades[1]);
        System.out.println("Arreglo de enteros indice 2: " + edades[2]);
        
        // declarar e instanciar arreglo de tipos object
        Persona personas[] = new Persona[4];
        
        // inicializar los valores del arreglo
        personas[0] = new Persona("Chona");
        personas[1] = new Persona("Locochona");
        
        System.out.println("Arreglo de personas indice 0: " + personas[0]);
        System.out.println("Arreglo de personas indice 1: " + personas[1]);
        
        //arreglo utiloizando notacion simplificada
        String nombres[] = {"Sara","Laura","Carlos","Carmen"};
        //imprimir  cada valor 
        for(int i = 0; i < nombres.length; i++){
            System.out.println("Arreglo String indice " + i + ": " + nombres[i]);
        }
    }
    
}
