package paquete1;

public class Clase2 {
    public Clase2(){
        //prueba de constructores clase1
        new Clase1();//llamada a cosntructor publico
        new Clase1("uno", "dos");//llamada a cosntructor protected
        new Clase1("unos", "dos", "tres");//llamada a constructor default o package
        //no podemos llamar a cosntructores privados desde otras clases
        //new Clase1("uno","dos", "tres","cuatro");//llamada a constructor privado
    }
    public void pruebaDesdeClase2(){
        Clase1 c1 = new Clase1();
        System.out.println("atributo publico: " + c1.atributoPublico);
        System.out.println("atributo protegido: " + c1.atributoProtegido);
        System.out.println("atributo default o package: " + c1.atributoDefault);
        //System.out.println("atributo privado :" + c1.atributoPrivado);
        
        System.out.println("");
        System.out.println("metodo publico" + c1.metodoPublico());
        System.out.println("metodo protegido" + c1.metodoProtegido());
        System.out.println("metodo default o package" + c1.metodoDefault());
        //System.out.println("metodo privado" + c1.metodoPrivado());
    }
    
    public static void main(String[] args) {
        Clase2 c2 = new Clase2();
        c2.pruebaDesdeClase2();
    }
}
