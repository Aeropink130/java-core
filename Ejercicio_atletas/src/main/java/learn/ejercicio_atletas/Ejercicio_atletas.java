
package learn.ejercicio_atletas;

import java.util.Scanner;


public class Ejercicio_atletas {

    public static int tiempoMenor (Atleta atlet [])
    {
        float tiempo;
        int indice = 0;
        
        tiempo = atlet[0].getTiempo();
        
        for (int i = 1 ; i < atlet.length ; i++)
        {
            if (atlet[i].getTiempo() < tiempo)
            {
                    tiempo = atlet[i].getTiempo();
                    indice = i;
            }
        }
        return indice;
    }
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        String nombre;
        int numero, iMenor;
        float tiempo;
        
        
        System.out.println("Ingresa la cantidad de atletas");
        numero = leer.nextInt();
        
        Atleta atlet[] = new Atleta[numero];
        
        for (int i = 0; i < atlet.length; i++)
        {
            leer.nextLine();
            System.out.println("Ingresa el nombre del atleta "+(i+1));
            nombre = leer.nextLine();
            System.out.println("Introduce el numero que identificara al atleta");
            numero = leer.nextInt();
            System.out.println("Introduce el tiempo que hizo el atleta "+(i+1));
            tiempo = leer.nextFloat();
            
            atlet[i] = new Atleta (nombre, numero, tiempo);
            
        }
        
        iMenor = tiempoMenor(atlet);
        System.out.println("El atleta ganador es: ");
        System.out.println(atlet[iMenor].mostrarDatos());
        
    }
}