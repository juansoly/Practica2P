package Ejercicio4;

public class Main {
    public static void main(String[] Args) {
        ListaCircularDoblementeEnlazada listaCircularDoblementeEnlazada = new ListaCircularDoblementeEnlazada();
        System.out.println(listaCircularDoblementeEnlazada.estaVacia());
        for (int i = 0; i <= 5; i++) {
            listaCircularDoblementeEnlazada.insertarFinal(i);
        }
        listaCircularDoblementeEnlazada.mostrar();
        listaCircularDoblementeEnlazada.eliminarFinal();
        listaCircularDoblementeEnlazada.eliminarFinal();
        listaCircularDoblementeEnlazada.mostrar();

        listaCircularDoblementeEnlazada.mostrarAdelante(8);
        listaCircularDoblementeEnlazada.mostrarAtras(8);


    }
}
