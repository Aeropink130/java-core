
public class PasoPorReferencia {
    
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        persona.cambiarNombre("Pepa");
        
        System.out.println("valor nombre: " + persona.obtenerNombre());
        
        modificarPersona(persona);
        
        System.out.println("Nombre modificado: " + persona.obtenerNombre());
    }

    private static void modificarPersona(Persona personaArg) {
        personaArg.cambiarNombre("Carles");
    }
    
}
