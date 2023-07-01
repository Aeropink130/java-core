package paquete1;

public class Clase1 {
    //Definicion de atributos
    public String atributoPublico = "valor atributo publico";
    protected String atributoProtegido = "valor atributo protegido";
    String atributoDefault = "valor atributo default/package";
    private String atributoPrivado = "vlaor atributo privado";
    
    //Constructores
    public Clase1(){
        System.out.println("Constructor publico vacio");
    }
    
    public Clase1(String texto){
        System.out.println("Constructor publico con 1 argumento = " + texto);
    }
    
    protected Clase1(String texto1, String texto2){
        System.out.println("Cosntructor protected con 2 argumentos = " + texto1 + ", " + texto2);
    }
    
    Clase1 (String texto1, String texto2, String texto3){
        System.out.println("Constructor default o package");
    }
    
    private Clase1(String texto1, String texto2, String texto3, String texto4){
        System.out.println("Cosntructor privado");
    }
    
    //Metodos
    public String metodoPublico(){
        return "metodo publico";
    }
    
    protected String metodoProtegido(){
        return "metodo protegido";
    }
    
    String metodoDefault(){
        return "metodo default o package";
    }
    
    private String metodoPrivado(){
        return "metodo privado";
    }
}
