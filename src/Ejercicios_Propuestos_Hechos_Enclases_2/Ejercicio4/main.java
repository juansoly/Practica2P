package Ejercicios_Propuestos_Hechos_Enclases_2.Ejercicio4;

public class main extends MaximoDeUnaMatriz{
    public static void  main(String[]args){
        int[][][] matriz= {
                {{2,3}, {2,6}, {7,8}},
                {{8,3},{1,2}, {5,4}}
        } ;
        int maximo = encontrarMaximo(matriz,0,0,0);
        System.out.println("el maximo de la matriz es:" + maximo);
    }
}
