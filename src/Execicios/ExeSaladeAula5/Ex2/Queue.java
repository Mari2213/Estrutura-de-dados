package Execicios.ExeSaladeAula5.Ex2;

public class Queue {
    No front;
    No rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public void enqueue(String letra){
        No newNo = new No(letra);

        if (isEmpty()){
            front = newNo;
            rear = newNo;
        }
        else {
            rear.next = newNo;
            rear = newNo;
        }
    }

    public String dequeue(){
        if (isEmpty()){
            System.out.println("Fila vazia");
            return null;
        }

        String letra = front.letra;
        front = front.next;

        if (front == null){
            rear = null;
        }

        return letra;
    }

    public void imprimir(){
        if (isEmpty()){
            System.out.println("Fila vazia");
            return;
        }

        No current = front;
        System.out.println("Fila: ");
        while (current != null){
            System.out.println(current.letra +" ");
            current = current.next;
        }
        System.out.println();
    }
}
