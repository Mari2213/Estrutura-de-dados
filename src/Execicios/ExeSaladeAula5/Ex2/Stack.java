package Execicios.ExeSaladeAula5.Ex2;

public class Stack {
    No top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void push(String letra){
        No newNo = new No(letra);

        newNo.next = top;
        top = newNo;
    }

    public String pop(){
        if (isEmpty()){
            System.out.println("Pilha vazia");
            return null;
        }

        String letra = top.letra;
        top = top.next;
        return letra;
    }

    public String top(){
        if (isEmpty()){
            return null;
        }

        return top.letra;
    }

    public void imprimir(){
        if (isEmpty()){
            System.out.println("Pilha vazia");
            return;
        }

        No current = top;
        System.out.println("Pilha: ");
        while (current != null){
            System.out.println(current.letra +" ");
            current = current.next;
        }
        System.out.println();
    }
}
