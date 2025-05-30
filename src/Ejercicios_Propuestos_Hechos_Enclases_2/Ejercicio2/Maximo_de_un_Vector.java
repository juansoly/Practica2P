package Ejercicios_Propuestos_Hechos_Enclases_2.Ejercicio2;

import java.util.Vector;

public class Maximo_de_un_Vector {
    public static int MaximoVector(int[] vector, int indice) {
        if (indice == vector.length - 1) {
            return vector[indice];
        }
        int maximoResto = MaximoVector(vector, indice + 1);
        return Math.max(vector[indice], maximoResto);
    }
}
