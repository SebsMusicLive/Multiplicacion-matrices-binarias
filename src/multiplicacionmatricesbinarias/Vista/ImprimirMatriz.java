/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        boolean[][] matriz = new boolean[filas][columnas];

        // Rellenar la matriz con valores booleanos en orden binario
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // Calcular el valor binario correspondiente a la posición
                int valor = i * columnas + j;
                matriz[i][j] = ((valor >> (columnas - 1 - j)) & 1) == 1;
            }
        }

        // Imprimir la matriz
        System.out.println("Matriz generada:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] ? "1 " : "0 ");
            }
            System.out.println();
        }
        
        
    }
}
