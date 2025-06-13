package Ejercicio13;

public class main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.insertar(50);
        arbol.insertar(38);
        arbol.insertar(75);
        arbol.insertar(22);
        arbol.insertar(10);
        arbol.insertar(32);
        arbol.insertar(83);
        arbol.insertar(90);

        System.out.println("Recorrido en orden:");
        arbol.enOrden();
    }
}
