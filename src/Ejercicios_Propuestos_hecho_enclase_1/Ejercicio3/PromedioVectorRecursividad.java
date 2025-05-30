package Ejercicios_Propuestos_hecho_enclase_1.Ejercicio3;

public class PromedioVectorRecursividad {
    public static int PromedioVector(int[] vector, int suma) {
            if (suma < 0) {
                suma = 0;
                return 0;
            }
            return vector[suma] /PromedioVector(vector, suma - 1);
        }


}
