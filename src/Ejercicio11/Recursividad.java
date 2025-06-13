package Ejercicio11;

public class Recursividad {
    private static int compararVectores(int[] vector1, int[] vector2, int indice) {
        int sumaDiferencias;
        if (indice == vector1.length - 1) {
            sumaDiferencias = Math.abs(vector1[indice] - vector2[indice]);

        } else {
            sumaDiferencias = Math.abs(vector1[indice] - vector2[indice]) * compararVectores(vector1, vector2, indice + 1);

        }
        return sumaDiferencias;
    }

    /*
     * Metodo auxiliar que realiza la llamada al metodo recursivo
     *
     * */
    public static boolean compararVector(int[] vector1, int[] vector2) {
        return compararVectores(vector1, vector2, 0) == 0;
    }

}
