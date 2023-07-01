package palabrafinal;

public final class ClaseFinal {
    
    
    //variables marcadas como final
    public final int varNumero = 10;
    
    //constante en java
    public static final int VAR_PRIMITIVO = 15;
    
    public static final Persona VAR_PERSONA = new Persona();
    
    //metodo final
    public final void metodoFinal(){
        
    }
}

//class ClaseHija extends ClaseFinal{
//    no es posible modificar el comportamiento del metodo
//    public final void metodoFinal(){
//        
//    }
//}