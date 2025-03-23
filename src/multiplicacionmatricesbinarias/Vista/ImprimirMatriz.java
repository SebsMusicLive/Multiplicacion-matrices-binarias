

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
        
        byte filas = 5;//c.leerByte("Numero de filas de Matriz 1: ");
        byte columnas = 4; // c.leerByte("Numero de Columnasde Matriz 1: ");
        boolean[][] m1 = generarMatrizEnteros(filas, columnas);
               
        byte filas2 = 4;//c.leerByte("Numero de filas de Matriz 2: ");
        byte columnas2 = 3; //c.leerByte("Numero de Columnasde Matriz 2: ");
        boolean[][] m2 = generarMatrizEnteros(filas2, columnas2);
        
        if(columnas != filas2){
            c.imprimir("No se puede columnas de M1 debe ser igual a filas de M2");
        }else{
            
              // Imprimir la matriz
        System.out.println("Matriz generada1:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(m1[i][j] ? "1 " : "0 "); // Mostrar 1 para true y 0 para false
            }
            System.out.println();
        }
           
           // Imprimir la matriz
        System.out.println("Matriz generada2:");
        for (int i = 0; i < filas2; i++) {
            for (int j = 0; j < columnas2; j++) {
                System.out.print(m2[i][j] ? "1 " : "0 "); // Mostrar 1 para true y 0 para false
            }
            System.out.println();
        }
        
        boolean [][] mr = model.getMultiplicacion(m1,m2);
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