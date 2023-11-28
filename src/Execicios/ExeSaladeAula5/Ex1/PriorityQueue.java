package Execicios.ExeSaladeAula5.Ex1;

public class PriorityQueue {
    private No front;
    private No rear;
    private int normalCount;
    private int pneCount;

    public PriorityQueue() {
        front = null;
        rear = null;
        normalCount = 0;
        pneCount = 0;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public void enqueue(int senha, boolean isPNE){
        No newNo = new No(senha, isPNE);

        if (isEmpty()){
            front = newNo;
        }else {
            rear.next = newNo;
        }
        rear = newNo;

        if (isPNE){
            pneCount ++;
        }else {
            normalCount ++;
        }
    }

    public No dequeue(){
        if (isEmpty()){
            System.out.println("Fila vazia");
            return null;
        }

        No temp = front;
        front = front.next;

        if (temp.isPNE){
            pneCount --;
        }else {
            normalCount --;
        }

        return temp;
    }

    public boolean isTimeToServePNE(){
        return normalCount > 0 && normalCount % 3 == 0;
    }

    public No serveNext(){
        if (isEmpty()){
            System.out.println("Fila vazia");
            return null;
        }

        if (isTimeToServePNE() && pneCount > 0){
            return dequeuePNE();
        }else {
            return dequeue();
        }
    }

    public No dequeuePNE(){
        if (front.isPNE){
            return dequeue();
        }

        No current = front;
        No previous = null;

        while (current != null && !current.isPNE){
            previous = current;
            current = current.next;
        }

        if (current == null){
            return null;
        }

        if (current == rear){
            rear = previous;
        }

        previous.next = current.next;
        pneCount --;

        return current;
    }
}
