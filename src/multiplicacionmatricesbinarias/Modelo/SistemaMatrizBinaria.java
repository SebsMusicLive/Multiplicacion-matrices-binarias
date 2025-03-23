package multiplicacionmatricesbinarias.Modelo;

/**
 *
 * @author Sebastian
 */
public class SistemaMatrizBinaria {

    boolean m1[][];
    boolean m2[][];

    public SistemaMatrizBinaria() {
    }

public boolean[][] getMultiplicacion(boolean m1[][], boolean m2[][]) {
    boolean[][] matriz = new boolean[m1.length][m2[0].length];

    // Verificación de dimensiones (opcional, pero recomendado)
    if (m1[0].length != m2.length) {
        throw new IllegalArgumentException("Las dimensiones de las matrices no son compatibles para la multiplicación");
    }

    int contador = 0;
    int m = 0;
    int s = 1;
    for (int i = 0; i <= m1.length - 1; i++) {
        int j = m2.length - 1;

        boolean suma = false;
        for (int n = m1[0].length - 1; m <= m2[0].length - 1; n--) {
            contador++;
            boolean a1 = m1[i][n];
            boolean b1 = m2[j][m];

            // Realizar la operación AND
            boolean producto = a1 && b1;

            // Acumular el resultado usando la operación OR (suma booleana)
            if (s > 0) {
                suma = producto; // Inicializar la suma con el primer producto
                s--;
            } else {
                if(suma == true && producto == true){
                    suma = false;  
                }else{
                    suma = suma || producto; // Acumular con OR
                }
                
            }

            j--;
            if (j == -1) {
                matriz[i][m] = suma; // Asignar el resultado acumulado
                n = m1[0].length; // Reiniciar el índice de columnas de m1
                m++; // Mover a la siguiente columna de m2
                j = m2.length - 1; // Reiniciar el índice de filas de m2
                s = 1; // Reiniciar el contador de suma
            }
        }
        m = 0; // Reiniciar el índice de columnas de m2 para la siguiente fila de m1
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
