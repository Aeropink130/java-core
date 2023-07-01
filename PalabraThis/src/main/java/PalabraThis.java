public class PalabraThis {
    public static void main(String[] args) {
        
        Persona persona = new Persona("Juan");
        
        
    }
}

class Persona{
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;//this apunta al objeto tipo persona
        System.out.println("Impresion del operado this dentro de la clase perosna: " + this);// this apunta a un objet de tipo persona en este momento
        Imprimir imprimir = new Imprimir();
        imprimir.imprmir(this);//this contiene la referencia de tipo persona
    }
    
}

class Imprimir{
    public void imprmir(Persona p){
        System.out.println("Impresion argumento persona: " + p);//valor del objeto de tipo persona
        System.out.println("Impresion del objeto actual (this): " + this);//this apunta a  un onjeto de tipo imprimir en este momento
    }
}