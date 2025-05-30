package Ejercicios_Propuestos_Hechos_Enclases_2.Ejercicio1;


public class CompararVector {
    static Boolean comparar(int[] vector1, int[] vector2, int indice) {
        if (indice == vector1.length) {
            return true;
        }
        if (vector1[indice] != vector2[indice]) {
            return false;

        }
        return comparar(vector1, vector2, indice + 1);


    }
}

