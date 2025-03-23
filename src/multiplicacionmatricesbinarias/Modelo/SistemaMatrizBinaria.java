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

       /* if (m1.length != m2[0].length || m2.length != m1[0].length) {
            throw new IllegalArgumentException("Error al multiplicar las matrices");
        }*/

        int m = 0;
        for (int i = 0; i <= m1.length-1; i++) {
            int j = m2.length-1;

            boolean suma = false;
            for (int n = m1[0].length-1; m <= m2[0].length-1; n--) {
                suma ^= (m1[i][n] && m2[j][m]);
                //suma = suma || (m1[i][n] && m2[j][m]);
                j--;
                if (j == -1) {
                    matriz[i][m] = suma;
                    n = m1[0].length;
                    m++;
                    j = m2.length-1;
                }

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

