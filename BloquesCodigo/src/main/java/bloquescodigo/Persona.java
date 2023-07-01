
package bloquescodigo;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    //bloque de inicializacion de codigo static
    static{
        contadorPersonas = 10;
        System.out.println("Ejecucion de bloque estatico");
    }
    
    //bloque NO estatico,s e copia a cada objeto
    {
        System.out.println("Ejecucuion bloque NO estatico");
        this.idPersona = ++contadorPersonas;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }
    public int getIdPersona(){
        return this.idPersona;
    }
}
