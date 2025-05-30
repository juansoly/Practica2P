package Ejercicios_Propuestos_Hechos_Enclases_2.Ejercicio3;

public class Main extends Comparar2_Matrices{
    public  static  void main(String[]args){
        int [][][]matriz1= {{{1,3},{3,4}}, {{3,5},{2,4}}};
        int [][][]matriz2= {{{1,3},{3,4}}, {{3,5},{2,4}}};
        boolean sonIguales= compararMatriz(matriz1,matriz2,0,0,0);
        System.out.println("las matrizes son iguales:"+sonIguales);
    }
}
