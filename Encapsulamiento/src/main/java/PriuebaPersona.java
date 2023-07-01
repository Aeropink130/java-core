
public class PriuebaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("Pepa",5000,false);
        
//        System.out.println("Nombre persona: " + persona.getNombre());
        
        persona.setNombre("Carles");
        
//        System.out.println("Nombre persona: " + persona.getNombre());
//        System.out.println("Sueldo: " + persona.getSueldo());
//        System.out.println("persona borrada: " + persona.isEliminado());

        System.out.println("Persona: " + persona.toString());
        
        System.out.println("persona sin toString: " + persona);
    }
}
