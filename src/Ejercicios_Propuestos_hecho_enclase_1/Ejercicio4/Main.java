package Ejercicios_Propuestos_hecho_enclase_1.Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("introduce la base");
        int base= scanner.nextInt();
        System.out.println("introduce el exponente");
        int exponente= scanner.nextInt();

        System.out.println("la potencia  base es:"+ base+" :elevano a :"+exponente+" ;  es igual a:"+PorenciaDeUnNumero.potencia(base,exponente));



    }
}
