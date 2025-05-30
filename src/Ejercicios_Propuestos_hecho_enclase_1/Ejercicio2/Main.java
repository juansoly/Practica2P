package Ejercicios_Propuestos_hecho_enclase_1.Ejercicio2;

import java.util.Scanner;

public class Main extends InvertirCadena {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese un nombre o palabra");
        String nombre= scanner.nextLine();
        String invertircadena= InvertirCadena(nombre);


        System.out.println("su cadena invertida es ==>"+ invertircadena);
    }
}
