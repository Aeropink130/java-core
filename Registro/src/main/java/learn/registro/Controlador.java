
package learn.registro;

import java.util.ArrayList;
import java.util.List;

public class Controlador 
{
    private List<Persona> personas = new ArrayList<>();
    private int tamano = personas.size();
    
    public void crearPersona (String nombre, int edad)
    {
        Persona persona = new Persona (nombre, edad);
        personas.add(persona);
    }
    
    public String listarPersonas() {
    StringBuilder sb = new StringBuilder();
    for (Persona persona : personas) {
        sb.append(persona.getNombre()).append(" - ").append(persona.getEdad()).append("\n");
    }
    return sb.toString();
}
}
