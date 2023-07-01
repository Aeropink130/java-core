package test;

import datos.*;
import excepciones.*;

public class ManejoExcepciones2 {
    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionMySQL();
        datos.simularError(true);
        ejecutar(datos, "listar");
        
        AccesoDatos datos2 = new ImplementacionOracle();
        datos2.simularError(true);
        ejecutar(datos2,"insertar");
    }
    
    private static void ejecutar(AccesoDatos datos, String accion){
        if("listar".equals(accion)){
            try {
                datos.listar();
            }catch (LecturaDatosEx ex) {
                System.out.println("Errro de Lectura");
                ex.printStackTrace(System.out);
                System.out.println(ex.getCause());
            } 
            catch (AccesoDatosEx ex) {
                System.out.println("Error de acceso a datos");
                ex.printStackTrace(System.out);
            }
            catch (Exception ex) {
                System.out.println("Ocurrio un error general");
                ex.printStackTrace(System.out);
            }
            finally{
                System.out.println("Procesar finally es opcional, pero siempre se va a ejecutar");
            }
        }
        else if("insertar".equals(accion)){
            try {
                datos.insertar();
            } catch (AccesoDatosEx ex) {
                System.out.println("Excepcion de acceso a datos");
                ex.printStackTrace(System.out);
            }
            finally{
                System.out.println("Procesar finally es opcional, pero siempre se va a ejecutar");
            }
        }
        else{
            System.out.println("No se proporciono ninguna accion conocida");
        }
    }
}
