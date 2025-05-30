

package Ejercicios_Propuestos_Hechos_Enclases_2.Ejercicio1;

public class Main  extends CompararVector {
    public static  void  main(String[]args){
        int[] vector1 ={1,2,3,4,5};
        int[] vector2 ={1,2,3,4,5};
        if(vector1.length != vector2.length){
            System.out.println("los vectores tienen diferentes tamaños , no son iguales");


        }else {
            boolean sonIguales = comparar(vector1,vector2, 0);
            System.out.println("son iguales :"+ sonIguales);
        }
    }
}
