public class Aritmetica {
    
    int ancho;
    int alto;
    int profundo;

    public Aritmetica() {
    }

    public Aritmetica(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public int volumen(){
        return  this.ancho * this.alto * this.profundo;
    }
    
}
