import java.util.InputMismatchException;
import java.util.Scanner;

public class tallerLab2 {
    public static int cantidadDias() throws InputMismatchException {
        System.out.println("Ingrese cantidad de dias: \n");
        Scanner teclado = new Scanner(System.in);
        int nDias = teclado.nextInt();
        return nDias;
    }
    public static void validarDias() {
        try {
            cantidadDias();
        } catch (Exception InputMismatchException){
            System.out.println("Ingrese un numero valido");
            validarDias();
        }
    }
}
