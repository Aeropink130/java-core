public class SobrecargaDeConstructores {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Peputo", 25);
        System.out.println(persona1);
        
        Empleado empleado1 = new Empleado("Pitupa", 30, 4000);
        System.out.println(empleado1);
    }
}
