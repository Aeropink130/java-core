
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        inicio:
        for (int i = 0; i < 10; i++) {
            //imprimir pares
            if (i % 2 != 0) {
                continue inicio;
            }
            System.out.println("i = " + i);
        }

    }
}
