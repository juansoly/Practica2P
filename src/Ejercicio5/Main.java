package Ejercicio5;

public class Main {
    public static  void  main(String[]Args){

       /*  Cola cola = new Cola();
        System.out.println(cola.EstaVacia());
        for (int i = 1; i <=5; i++) {
            cola.insertar(i);
        }
        cola.Mostrar();
        cola.Eliminar();
        cola.Eliminar();
        cola.Mostrar();
*/
        Pila pila = new Pila();
        System.out.println(pila.EstaVacia());

        for (int i = 1; i <= 5 ; i++) {
            pila.insertar(i);
        }
            pila.Mostrar();

            pila.Eliminar();
            pila.Eliminar();
            pila.Eliminar();
            pila.Mostrar();
        }
    }

