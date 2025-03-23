package multiplicacionmatricesbinarias.Vista;

import multiplicacionmatricesbinarias.Controller.Consola;
import multiplicacionmatricesbinarias.Modelo.SistemaMatrizBinaria;

/**
 *
 * @author nn
 */
public class ImprimirMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SistemaMatrizBinaria model = new SistemaMatrizBinaria();
        Consola c = new Consola();

        byte filas = c.leerByte("Numero de filas de Matriz 1: ");
        byte columnas = c.leerByte("Numero de Columnasde Matriz 1: ");
        boolean[][] m1 = generarMatrizEnteros(filas, columnas);

        byte filas2 = c.leerByte("Numero de filas de Matriz 2: ");
        byte columnas2 = c.leerByte("Numero de Columnasde Matriz 2: ");
        boolean[][] m2 = generarMatrizEnteros(filas2, columnas2);

        System.out.println("Matriz generada1:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(m1[i][j] ? "1 " : "0 ");
            }
            System.out.println();
        }

        System.out.println("Matriz generada2:");
        for (int i = 0; i < filas2; i++) {
            for (int j = 0; j < columnas2; j++) {
                System.out.print(m2[i][j] ? "1 " : "0 "); 
            }
            System.out.println();
        }

        boolean[][] mr = model.getMultiplicacion(m1, m2);
        System.out.println("Resultado:");
        for (int i = 0; i <= mr.length - 1; i++) {
            for (int j = 0; j <= mr[0].length - 1; j++) {
                System.out.print(mr[i][j] ? "1 " : "0 "); 
            }
            System.out.println();
        }

    }

    public static boolean[][] generarMatrizEnteros(byte filas, byte columnas) {

        boolean[][] matriz = new boolean[filas][columnas];

        for (int i = 0; i < filas; i++) {
            int valor = i;
            for (int j = columnas - 1; j >= 0; j--) {
                matriz[i][j] = (valor & 1) == 1;
                valor = valor >> 1;
            }
        }

        return matriz;
    }
}
