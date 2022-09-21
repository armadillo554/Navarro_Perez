import java.util.Scanner;

public class tallerLab2 {
    public static void main(String args[]) {
    }
    public static void menu(double[][] matrizSismos){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {

            System.out.println("1. Sismo Más Intenso");
            System.out.println("2. Total dias registrados con sismos mayores a 5.5 grados");
            System.out.println("3. Alerta Escalada Sismica");
            System.out.println("4. Alerta Emjambre Sismico");
            System.out.println("5. SALIR");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        maxMatriz(matrizSismos);
                        break;
                    case 2:
                        diasSismosIntensos(matrizSismos);
                        break;
                    case 3:
                        escaladaSismica(matrizSismos);
                        break;
                    case 4:
                        emjambreSismico(matrizSismos);
                        break;
                    case 5:
                        salir=true;
                        break;
                    default:
                        System.out.println("Escriba sólo números entre 1 y 5");
                }
            } catch (Exception e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }


    public static void maxMatriz(double[][] matrizSismos) {
        double numeroMayor = matrizSismos[0][0];
        int dia = 0;
        int hora = 0;
        for (int x = 0; x < matrizSismos.length; x++) {
            for (int y = 0; y < matrizSismos[x].length; y++) {
                if (matrizSismos[x][y] > numeroMayor) {
                    numeroMayor = matrizSismos[x][y];
                    dia = x;
                    hora = y;
                }
            }
        }
        System.out.println("El dia con mayor intensidad fue el dia: " + (dia + 1) + ", a las: " + (hora + 1) + "hrs, con intensidad: " + numeroMayor + " grados.");
    }

    public static void diasSismosIntensos(double[][] matrizSismos) {
        int dias = 0;
        boolean mayor = false;
        for (int x = 0; x < matrizSismos.length; x++) {
            for (int y = 0; y < matrizSismos[x].length; y++) {
                if (matrizSismos[x][y] >= 5.5) {
                    mayor = true;
                }
            }
            if (mayor = true) {
                dias = dias + 1;
                mayor = false;
            }
        }
        System.out.println("Los dias registrados con grados superiores o iguales a 5.5 fueron: " + dias);
    }

    public static void escaladaSismica(double[][] matrizSismos){
        boolean alerta=false;
        for (int x = 0; x < matrizSismos.length; x++) {
            for (int y = 0; y < matrizSismos[x].length; y++) {
                if (matrizSismos[x][y] > 6.0) {

                    }
                }
            }
        if(alerta=true){
            System.out.println("Alerta Escalada Sísmica!!!");
        }else{
            System.out.println("Sin alerta de Escalada Sismica");
        }

        }

        public static void emjambreSismico(double[][] matrizSismos){
    }
}



