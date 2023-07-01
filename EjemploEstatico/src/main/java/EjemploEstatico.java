public class EjemploEstatico {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Chicho");
        System.out.println(persona1);
        
        Persona persona2 = new Persona("Pepa");
        System.out.println(persona2);
        
        Persona persona3 = new Persona("Chicho");
        System.out.println(persona3);
        
        System.out.println("Contador de personas: " + Persona.getContadorPersonas());
        
    }
}
