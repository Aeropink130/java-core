package ventas;

import java.util.Scanner;
import mundopc.*;

public class MundoPcVentas {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int op;
        boolean salir = false;
        
        do{
            
            System.out.println("Elige una de las siguientes opciones:");
            System.out.println("1.Agregar computadora");
            System.out.println("2.Agregar mouse/Teclado");
            System.out.println("3.Crear orden");
            System.out.println("4.Salir");
            op = scanner.nextInt();
            
            switch (op)
            {
                
            }
        }while(!salir);
        
    }

}
