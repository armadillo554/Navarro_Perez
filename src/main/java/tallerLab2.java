public class tallerLab2 {
    public static void main(String args[]){
    }
    public static void matrizMax(int[][] matrizSismos){
        int numeroMayor = matrizSismos[0][0];
        int dia=0;
        int hora=0;
        for (int x=0;x<matrizSismos.length;x++) {
            for (int y=0;y<matrizSismos[x].length;y++) {
                if (matrizSismos[x][y] > numeroMayor) {
                    numeroMayor = matrizSismos[x][y];
                    dia = x;
                    hora=y;
                }
                }
            }
        System.out.println("El dia con mayor intensidad fue el dia: "+(dia+1)+", a las: "+(hora+1)+"hrs, con intensidad: "+numeroMayor+" grados.");
        }
    }

