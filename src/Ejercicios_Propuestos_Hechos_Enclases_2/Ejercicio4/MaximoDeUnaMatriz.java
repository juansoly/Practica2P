package Ejercicios_Propuestos_Hechos_Enclases_2.Ejercicio4;

import Ejercicios_Propuestos_Hechos_Enclases_2.Ejercicio2.Maximo_de_un_Vector;

public class MaximoDeUnaMatriz {
    public static int encontrarMaximo(int [][][] matriz , int i, int j,int k){
        if(i == matriz.length)return Integer.MIN_VALUE;
        if(j== matriz[i].length)return encontrarMaximo(matriz,i+1,0,0);
        if(k == matriz[i][j].length)return encontrarMaximo(matriz,i,j+1,0);
        int maxdelResto = encontrarMaximo(matriz,i,j,k+1);
        return Math.max(matriz[i][j][k],maxdelResto);
    }
}
