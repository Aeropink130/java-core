public class PalabraReturnTiposPrimitivos {
    
    public static void main(String[] args) {
        
        sumarSinRetornarValor(3, 6);
        
        int resultado = sumarRetornandoValor(0, 0);
        System.out.println("resultado retornando valor = " + resultado);
        
    }

    private static void sumarSinRetornarValor(int a, int b) {
        System.out.println("El resultado sin retornar valor es = " + (a + b));
        return;//opcional
    }

    private static int sumarRetornandoValor(int a, int b) {
        if(a == 0 && b == 0){
            System.out.println("No puede proporcionar valores en 0");
            return 0;
        }
        return a + b;
    }
}
