
package test;

public class EjemploVarArgs {
    public static void main(String[] args) {
        //imprimimos varios numeros
        imprimirNumeros(4,6,7,2,1,3);
        
        //parametros variables
        System.out.println("");
        variosParametros("Juan", true, 15, 2, 5);
    }
    
    private static void variosParametros(String nombre, boolean bandera, int... numeros){
        System.out.println("nombre = " + nombre);
        System.out.println("bandera = " + bandera);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento = " + numeros[i]);
        }
    }

    private static void imprimirNumeros(int... numeros) {
        //recorremos cada elemento del arreglo
        for (int i = 0; i < numeros.length; i++) {
            int elemento = numeros[i];
            System.out.println("elemento = " + elemento);
        }
    }
}
