package Ejercicios_Propuestos_Hechos_Enclases_2.Ejercicio3;

public class Comparar2_Matrices {
    public static Boolean compararMatriz(int[][][] m1, int[][][] m2, int i, int j, int k) {
        if (i == m1.length) return true;


        if (m1[i][j][k] != m2[i][j][k]) return false;


        if (k + 1 < m1[i][j].length) {
            return compararMatriz(m1, m2, i, j, k + 1);


        } else if (j + 1 < m1[i].length) {
            return compararMatriz(m1, m2, i,j +1,0);


        } else {
            return compararMatriz(m1, m2, i +1, 0, 0);
        }
    }
}
