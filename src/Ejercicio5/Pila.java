package Ejercicio5;


import Ejercicio1.Nodo;

public class Pila extends  Cola {

    @Override
        public void Eliminar() {
        if (!EstaVacia()) {
            Nodo ultimo = primero;
            Nodo penultimo = null;
            while (ultimo.getSiguiente() != null) {
                penultimo = ultimo;
                ultimo = ultimo.getSiguiente();
            }

           penultimo.setSiguiente(null);

        }
    }
}


