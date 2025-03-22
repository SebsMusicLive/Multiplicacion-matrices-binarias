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
        
        byte filas = c.leerByte("Numero de filas de Matriz 1: ");
        byte columnas = c.leerByte("Numero de Columnasde Matriz 1: ");
        boolean[][] m1 = generarMatrizEnteros(filas, columnas);
               
        byte filas2 = c.leerByte("Numero de filas de Matriz 2: ");
        byte columnas2 = c.leerByte("Numero de Columnasde Matriz 2: ");
        boolean[][] m2 = generarMatrizEnteros(filas2, columnas2);
        
        if(columnas != filas2){
            c.imprimir("No se puede columnas de M1 debe ser igual a filas de M2");
        }else{
            
        }

        
        
    }
    
    public static boolean[][] generarMatrizEnteros(byte filas, byte columnas) {
        
        boolean[][] matriz = new boolean[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int valor = i * columnas + j;
                matriz[i][j] = ((valor >> (columnas - 1 - j)) & 1) == 1;
            }
        }
        
        return matriz;
    }
}
