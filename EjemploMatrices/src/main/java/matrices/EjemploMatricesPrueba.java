package matrices;

public class EjemploMatricesPrueba {
    
    public static void main(String[] args) {
        //matriz tipo int
        int edades[][] ;
        //instanciamos
        edades = new int[3][2];
        //inicializar valores
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][1] = 38;
        
        System.out.println("Matriz de enteros indice 0 - 0: " + edades[0][0]);
        System.out.println("Matriz de enteros indice 2 - 0: " + edades[2][0]);
        
        //declarar e instanciar una amtris de tipo persona
        Persona personas[][] = new Persona[1][2];
        
        //inicializamos valores
        personas[0][0] = new Persona("Pepota");
        personas[0][1] = new Persona("Karlota");
        
        //imprimimos valores
        System.out.println("Matriz persona indice 0 0: " + personas[0][0]);
        System.out.println("Matriz persona indice 0 1: " + personas[0][1]);
        
        for (int renglon = 0; renglon < personas.length; renglon++) {
            for (int columna = 0; columna < personas[renglon].length; columna++) {
                System.out.println("Matriz personas indice: " + renglon + " - " + columna + ": " + personas[renglon][columna]);
            }
        }
        
    }
    
}
