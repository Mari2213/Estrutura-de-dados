package Execicios.ExeSaladeAula5.Ex2;

public class Principal {

    public static void main(String[] args) {
        Stack pilha = new Stack();
        Queue fila = new Queue();

        pilha.push("A");
        pilha.push("B");
        pilha.push("C");
        pilha.imprimir();
        fila.enqueue(pilha.top());
        fila.enqueue(pilha.top());
        fila.enqueue("D");
        fila.imprimir();
        pilha.push(fila.dequeue());
        pilha.imprimir();
        fila.enqueue(fila.dequeue());
        fila.enqueue(pilha.pop());
        fila.imprimir();
        pilha.push("E");
        pilha.imprimir();
        fila.enqueue("E");
        fila.imprimir();
        pilha.pop();
        pilha.imprimir();

        System.out.println();
        System.out.println("FINAL");
        fila.imprimir();
        pilha.imprimir();
    }
}
