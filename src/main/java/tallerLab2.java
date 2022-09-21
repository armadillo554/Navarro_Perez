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
    public static double [][] matrizHorasDias(int nDias){
        double generarMatriz[][]= new double[nDias][24];
        return generarMatriz;
    }
    public static double generarGrado(){
        double grado= Math.random()*9.5+0.5;
        return grado;
    }
    public static void llenarMatriz(double [][] matrizHorasDias){
        for (int columna=0;columna<=matrizHorasDias.length;columna++){
            for (int fila=0;fila<=matrizHorasDias[columna].length; fila++){
                generarGrado();
            }
        }
    }

}
