package paquete2;

import paquete1.Clase1;

public class Clase3 extends Clase1{
    public Clase3(){
        //prueba de constructores clase1
        super("uno","dos");//cosntructor protegido
        new Clase1();//llamada a cosntructor publico
        //new Clase1("uno", "dos");//llamada a cosntructor protected
        //new Clase1("unos", "dos", "tres");//llamada a constructor default o package
        //no podemos llamar a cosntructores privados desde otras clases
        //new Clase1("uno","dos", "tres","cuatro");//llamada a constructor privado
    }
    
    public void pruebaDesdeClase3(){
        Clase1 c1 = new Clase1();
        System.out.println("atributo publico: " + c1.atributoPublico);
        System.out.println("atributo protegido: " + atributoProtegido);
        //System.out.println("atributo default o package: " + c1.atributoDefault);
        //System.out.println("atributo privado :" + c1.atributoPrivado);
        
        System.out.println("");
        System.out.println("metodo publico" + c1.metodoPublico());
        System.out.println("metodo protegido" + metodoProtegido());
        //System.out.println("metodo default o package" + c1.metodoDefault());
        //System.out.println("metodo privado" + c1.metodoPrivado());
    }
    
    public static void main(String[] args) {
        Clase3 c3 = new Clase3();
        c3.pruebaDesdeClase3();
    }
}
