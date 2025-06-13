package Ejercicio13;

public class Arbol {
    private Nodo raiz;
    public  void  insertar(int valor){
        raiz = insertarRec(raiz, valor);
    }
    private Nodo insertarRec(Nodo raiz, int valor){
        if(raiz == null){
            return  new Nodo(valor);

        }
        if(valor < raiz.getValor()){
            raiz.setIzquierda(insertarRec(raiz.getIzquierda(),valor));


        } else if (valor>raiz.getValor()) {
            raiz.setDerecha(insertarRec(raiz.getDerecha(),valor));

        }
        return  raiz;

    }
    public void  enOrden(){
        enOrdenRec(raiz);
    }
    private  void enOrdenRec(Nodo raiz){
        if(raiz != null){
            enOrdenRec(raiz.getIzquierda());
            System.out.println(raiz.getValor()+"");
            enOrdenRec(raiz.getDerecha());

        }
    }
}
