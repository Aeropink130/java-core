
public class PalabraNull {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Juan");
        System.out.println("Persona1: " + persona1.getNombre());
        
        Persona persona2 = persona1;
        System.out.println("Persona2: " + persona2.getNombre());
        
        persona1 = null;
        
        if(persona1 != null){
            System.out.println("Persona1: " + persona1.getNombre());
        }
        else{
            System.out.println("Persona1 no apunta a ningun objeto");
        }
        
        persona2 = null;
        
        System.gc();
    }
}

class Persona{
    
    String nombre;

        public Persona(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return this.nombre;
        }
}
