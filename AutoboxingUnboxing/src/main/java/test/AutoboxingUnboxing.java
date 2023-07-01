package test;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        //Autoboxing (envolvemos tipos primitivos en clases wrapper)
        Integer enteroObj = 10;
        System.out.println("enteroObj = " + enteroObj.intValue());
        
        //Unboxing (extraemos el tipo primitivo del objeto envolvente)
        
        int entero = enteroObj;
        System.out.println("entero = " + entero);
        
        Float floatObj = 15.4F;
        System.out.println("floatObj = " + floatObj.intValue());
        float flotante = floatObj;
        System.out.println("flotante = " + flotante);
        
        Boolean booleanObj = true;
        System.out.println("booleanObj = " + booleanObj.toString());
    }
}
