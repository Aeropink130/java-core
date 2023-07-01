package datos;

import excepciones.*;

public class ImplementacionMySQL implements AccesoDatos{
    
    private boolean simularError; 
    
    @Override
    public void insertar() throws AccesoDatosEx{
        if(simularError){
            throw new EscrituraDatosEx("Error de escritura de datos");
        }
        else{
            System.out.println("Insertar desde MySql");
        }
    }

    @Override
    public void listar() throws AccesoDatosEx{
        if(simularError){
            throw new LecturaDatosEx("Error de laectura de datos");
        }
        else{
            System.out.println("Listar desde MySql");
        }
    }

    @Override
    public void simularError(boolean simularError) {
        this.simularError = simularError;
    }
    
    public boolean isSimularError(){
        return this.simularError;
    }
    
}
