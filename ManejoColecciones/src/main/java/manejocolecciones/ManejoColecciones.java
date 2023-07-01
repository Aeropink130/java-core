package manejocolecciones;

import java.util.*;

public class ManejoColecciones {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("1");
        miLista.add(2);
        miLista.add(3);
        //elemento repetido
        miLista.add(3);
        //imprimir(miLista);
        
        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        //elemento duplicado
        miSet.add("300");
        //imprimir(miSet);
        
        Map miMapa = new HashMap();
        //llave, valor
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Carlos");
        //elementoduplicado, sustituye al valor agregado previamente
        miMapa.put("valor3", "Rosario");
        //imprimir todas las llaves
        //imprimir(miMapa.keySet());
        //imprimimos los valores 
        //imprimir(miMapa.values());
        
        System.out.println(miMapa.get("valor3"));;
    }
    
    private static void imprimir(Collection coleccion){
        for(Object elemento : coleccion){
            System.out.println("elemento: " + elemento);
        }
    }
}
