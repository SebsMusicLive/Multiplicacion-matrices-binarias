/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicacionmatricesbinarias.Modelo;

/**
 *
 * @author Sebastian
 */
public class SistemaMatrizBinaria{
    
    boolean m1[][];
    boolean m2[][];
    
    public SistemaMatrizBinaria(){}
    
   
    
    private boolean [][]getMultiplicacion(boolean m1[][], boolean m2[][]){
        boolean [][] matriz=null;
        
        if(m1.length != m2[0].length || m2.length != m1[0].length){
            throw new IllegalArgumentException("Error al multiplicar las matrices");
        }
        
        
        return matriz;
    }
    
   

    public boolean[][] getM1() {
        return m1;
    }

    public boolean[][] getM2() {
        return m2;
    }
    
    
    
}
