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
        int filasM1 = m1.length;
        int columnasM1 = m1[0].length;
        int columnasM2 = m2[0].length;
        
        if(filasM1 != columnasM2){
            throw new IllegalArgumentException("Error al multiplicar las matrices");
        }
        boolean [][] matriz=null;       
        
        for(int i = 0; i <= filasM1; i++){
            for(int j = 0; j <= columnasM2; i++){
                
            }
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
