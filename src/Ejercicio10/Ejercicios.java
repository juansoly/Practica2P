package Ejercicio10;

public class Ejercicios {
    /*
    invertir una cadena de texto "Recursividada" = dadivisruceR

    * */
    private static String invertirCadena(String cadena, int indice) {
        String inversa;
        if (indice == 0) {
            inversa = String.valueOf(cadena.charAt(indice));

        } else {
            inversa = String.valueOf(cadena.charAt(indice)) + invertirCadena(cadena, indice - 1);


        }
        return inversa;

    }

    /*
     * Metodo auxiliar que llama al metodo recursiva
     * */
    public static String invertirCadena(String cadena) {

        return invertirCadena(cadena, cadena.length() - 1);
    }
}
