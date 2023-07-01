
public class PruebaPersonas {

    public static void main(String[] args) {
        
        //Creacion de un objeto de tipo Persona
        
        //Definicion variable de tipo Persona
        Persona persona1;
        
        //Intanciando (crando) un onjeto de clase persona
        
        persona1 = new Persona();
        
        //Accedemos al onjeto persona y llamamos al metodo desplegarNombres
        persona1.desplegarNombres();
        
        //Modiicamos los valores
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        
        System.out.println("");
        persona1.desplegarNombres();
        
        //Creacion de un segundo objeto
        Persona persona2 = new Persona();
        persona2.nombre = "Pe";
        persona2.apellido = "Pito";
        System.out.println("");
        persona2.desplegarNombres();
    }
}
