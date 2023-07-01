package datos;

import excepciones.*;

public class ImplementacionOracle implements AccesoDatos{
    
    private boolean simularError;

    @Override
    public void insertar() throws AccesoDatosEx{
        if(simularError){
            throw new EscrituraDatosEx("Error de escritura de datos");
        }
        else{
            System.out.println("Insertar desde Oracle");
        }
    }

    @Override
    public void listar() throws AccesoDatosEx{
        if(simularError){
            throw new LecturaDatosEx("Error de laectura de datos");
        }
        else{
            System.out.println("Listar desde Oracle");
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
