package Ejercicios_Propuestos_Hechos_Enclases_2.Ejercicio2;

public class Main extends Maximo_de_un_Vector {
    public static void main(String[] Args) {
        int[] vector = {3, 8, 5, 4, 2, 9, 12, 1};
        int maximo = MaximoVector(vector, 0);
        System.out.println("El numero mas grande del vector es :" + maximo);
    }
}
