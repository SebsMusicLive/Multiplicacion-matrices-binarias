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

                boolean producto = a1 && b1;

                if (s > 0) {
                    suma = producto; 
                    s--;
                } else {

                    suma = suma ^ producto; 
                }

                j--;
                if (j == -1) {
                    matriz[i][m] = suma; 
                    n = m1[0].length;
                    m++; 
                    j = m2.length - 1;
                    s = 1; 
                }
            }
            m = 0; 
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
