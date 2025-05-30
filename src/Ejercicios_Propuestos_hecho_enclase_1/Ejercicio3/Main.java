package Ejercicios_Propuestos_hecho_enclase_1.Ejercicio3;

public class Main extends PromedioVectorRecursividad {
    public static void main(String[]args){
        int suma=0;


        int promedio;
        
        int [] vector= {1,2,3,4,5,6,7,8,9,10};
        for (int i : vector) {
            suma +=i;
            
        }
        promedio = suma/ vector.length;

        System.out.println("el promedio del vector es :"+promedio);


    }
}
