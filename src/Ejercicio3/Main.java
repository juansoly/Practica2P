package Ejercicio3;

public class Main {
    public  static  void main(String[]Args){

        ListaCircularSimplementeEnlazada listaCircularSimplementeEnlazada = new ListaCircularSimplementeEnlazada();
        System.out.println(listaCircularSimplementeEnlazada.estaVacia());
        System.out.println(listaCircularSimplementeEnlazada.tamaño());

        for (int i = 1; i <= 12 ; i++) {
            listaCircularSimplementeEnlazada.insertarFin(i);

        }

        listaCircularSimplementeEnlazada.mostrar();
        System.out.println(listaCircularSimplementeEnlazada.tamaño());

        //listaCircularSimplementeEnlazada.eliminarFin();
        //listaCircularSimplementeEnlazada.eliminarFin();


       // listaCircularSimplementeEnlazada.mostrar();
        listaCircularSimplementeEnlazada.mostrarCircular(2);



    }
}
