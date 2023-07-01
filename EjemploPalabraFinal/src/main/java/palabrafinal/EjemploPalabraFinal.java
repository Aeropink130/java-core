package palabrafinal;

public class EjemploPalabraFinal {
    
    public static void main(String[] args) {
//        modificar el atributo final
//        ClaseFinal.VAR_PRIMITIVO = 5;

//        ClaseFinal.VAR_PERSONA = new Persona();

        ClaseFinal.VAR_PERSONA.setNombre("cacas");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
        
        ClaseFinal.VAR_PERSONA.setNombre("cacotas");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
    }
}
