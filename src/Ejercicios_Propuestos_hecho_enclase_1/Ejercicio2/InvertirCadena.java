package Ejercicios_Propuestos_hecho_enclase_1.Ejercicio2;

public class InvertirCadena {


    public  static  String InvertirCadena(String cadena ){
        if (cadena.isEmpty()){

            return cadena;
        }else {
            return InvertirCadena(cadena.substring(1))+ cadena.charAt(0);

        }


    }

}
