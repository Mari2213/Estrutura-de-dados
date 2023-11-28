package Aulas.Aula2;

public class Listaexe {

    private static class No{
        public No prox;
        public int val;

        public No(int val) {
            this.val = val;
            this.prox = null;
        }
    }

    private No inicio;

    public Listaexe(){
        inicio = null;
    }

    public boolean isEmpty(){
        return inicio == null;
    }

    public boolean search(int elem){
        for (No nodo = inicio; nodo != null; nodo = nodo.prox){
            if (elem == nodo.val){
                return true;
            }
        }
        return false;
    }

    public void insereInicio(int elem){
        No novoNo = new No(elem);
        novoNo.prox = inicio; // inicio antigo
        inicio = novoNo;     // inicio novo
    }

    public void removeInicio(){
        inicio = inicio.prox;
    }

    public String exibir(){
        if (isEmpty()){
            return "Lista vazia\n";
        }
        String str = "Lista encadeada: ";

        for (No nodo = inicio; nodo != null; nodo = nodo.prox){
            str += " "+ nodo.val;
        }
        return str + "\n";
    }
}
