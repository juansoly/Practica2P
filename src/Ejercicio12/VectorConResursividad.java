package Ejercicio12;

public class VectorConResursividad {
    private static int maximoVector(int[] vector, int indice, int maximo) {
        /*Metodo recursiva para calcular el maximo valor de un vector
        vector={2,9,6,7,6,3,4,3}
        *
        * */

        if (indice == vector.length - 1) {
            if (vector[indice] > maximo) {
                maximo = vector[indice];
            }
        } else {
            if (vector[indice] > maximo) {
                maximo = vector[indice];
            }
            maximo = maximoVector(vector, indice + 1, maximo);
        }
        return maximo;
    }

    /*
     * Metodo auxiliar que llama al metodo recusividad
     * */
    public static int maximoVector(int[] vector) {
        return maximoVector(vector, 0, 0);
    }
}