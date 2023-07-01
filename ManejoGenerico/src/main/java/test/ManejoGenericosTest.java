package test;

import genericos.ClaseGenerica;

public class ManejoGenericosTest {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();
        
        ClaseGenerica<String> objetoString = new ClaseGenerica("Prueba");
        objetoString.obtenerTipo();
        
        //No es posible utilizar tipos primitivos en clases genericas
        //ClaseGenerica<int> objetoPrimitivo = new ClaseGenerica(1);
    }
}
