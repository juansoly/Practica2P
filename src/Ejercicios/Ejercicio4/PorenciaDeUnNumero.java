package Ejercicios.Ejercicio4;

public class PorenciaDeUnNumero {
    public static  int potencia(int base, int exponente){
        if(exponente==1){
            return  base;
        }else {
            return  base*potencia(base, exponente-1);
        }
    }

}
