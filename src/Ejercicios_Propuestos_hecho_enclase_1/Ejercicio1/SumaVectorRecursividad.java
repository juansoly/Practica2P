package Ejercicios_Propuestos_hecho_enclase_1.Ejercicio1;

public class SumaVectorRecursividad {
    public static int SumarElementos(int[] vector, int indice) {
        if (indice < 0) {
            return 0;
        }
        return vector[indice] + SumarElementos(vector, indice - 1);
    }
}
