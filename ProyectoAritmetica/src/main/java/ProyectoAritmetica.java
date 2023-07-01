public class ProyectoAritmetica {

    public static void main(String[] args) {
        
        int ancho = 3;
        int alto = 2;
        int profundo = 6;
        
        Aritmetica objeto = new Aritmetica(ancho, alto, profundo);
        System.out.println("Volumen es = " + objeto.volumen());
    }
    
    
}
