package cpjlaboratoriofinal;

import java.util.Scanner;
import peliculas.negocio.*;

public class CPJLaboratorioFinal {
        private static final Scanner scanner = new Scanner(System.in);
        private static int opcion = -1;
        private static String nombreArchivo = "c:\\\\catalogoPeliculas\\\\peliculas.txt";
        private static final CatalogoPeliculas catalogoPeli = new CatalogoPeliculasImpl();
        
        public static void main(String[] args) {
        
            while (opcion != 0){
                try{
                    System.out.println("Elige una opcio del siguiente menu:\n1.Iniciar catalogo de peliculas"
                    + "\n2.Agregar pelicula"
                    + "\n3.Listar peliculas"
                    + "\n4.Buscar pelicula"
                    + "\n0.Salir");
                    
                    opcion = Integer.parseInt(scanner.nextLine());
                    System.out.println("");
                    switch(opcion){
                        case 1:
                            catalogoPeli.iniciarArchivo(nombreArchivo);
                            break;
                        
                        case 2:
                            System.out.println("Introduce el nommbre de la pelicula:");
                            String nombre = scanner.nextLine();
                            catalogoPeli.agregarPelicula(nombre, nombreArchivo);
                            break;
                            
                        case 3:
                            catalogoPeli.listarPeliculas(nombreArchivo);
                            break;
                            
                        case 4:
                            System.out.println("Introduce el nombre de la pelicula que deseas buscar:");
                            String buscar = scanner.nextLine();
                            catalogoPeli.buscarPelicula(nombreArchivo, buscar);
                            break;
                            
                        case 0:
                            System.out.println("Hasta pronto!");
                            break;
                            
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    System.out.println("");
                    
                } catch(Exception ex){
                    System.out.println("Error");
                    ex.printStackTrace(System.out);
                }
            }
    }
}
