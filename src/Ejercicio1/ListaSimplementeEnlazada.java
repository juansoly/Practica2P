package Ejercicio1;

public class ListaSimplementeEnlazada {
    protected Nodo primero;

    public ListaSimplementeEnlazada() {
        primero = null;
    }

    public boolean EstaVacia() {
        return primero == null;
    }

    public void insertar(Object dato) {
        if (EstaVacia()) {
            Nodo nuevo = new Nodo(dato, null);
            primero = nuevo;

        } else {
            Nodo nuevo = new Nodo(dato, primero);
            primero = nuevo;
        }

    }

    public void Eliminar() {
        if (!EstaVacia()) {
            primero = primero.getSiguiente();
        }
    }
    public  void  Mostrar(){
        Nodo tap= primero;
        while (tap != null ){
            System.out.print(tap.getDato() + "   ");
            tap = tap.getSiguiente();
        }
        System.out.println();

    }
}