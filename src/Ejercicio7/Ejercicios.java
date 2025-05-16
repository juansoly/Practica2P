package Ejercicio7;

public class Ejercicios {

     /*factorial de un numero
    5! = 5* 4 * 3 * 2 * 1
    4! = 4 * 3 * 2 * 1
    5! = 5 * 4!
    4! = 4 * 3!
    2! = 2 * 1!
     */

    public static int factorial(int n) {
        int factorial;


        if (n == 1) {
            //caso base
            factorial = n;

        } else {
            factorial = n * factorial(n - 1);

        }

        return factorial;
    }
    /*
    * maximo comun divisor (mcd), algoritmo de euclidesç
    * a= 412 y b = 184
    * */
    public  static int mcd(int a, int b){

        int mcd;
        if(a == b){
            mcd = b;

        }else {
            if(a > b){
                a = a - b;


            }else {
                b = b - a;
            }
            mcd = mcd(a, b);


        }
        return mcd;
    }
}


