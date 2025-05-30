package Ejercicios_Propuestos_hecho_enclase_1.Ejercicio1;

public class Main  extends  SumaVectorRecursividad{
    public  static  void main (String[]args){

        int [] vector = {1, 2, 3, 5, 6};
        int suma = SumarElementos(vector, vector.length -1);


        System.out.println("la suma de vector es "+suma);

    }
}

