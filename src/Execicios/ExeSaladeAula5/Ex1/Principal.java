package Execicios.ExeSaladeAula5.Ex1;

public class Principal {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();

        queue.enqueue(1,false); // normal
        queue.enqueue(2,true); // PNE
        queue.enqueue(3,false); // normal
        queue.enqueue(4,false); // normal
        queue.enqueue(5,true); // PNE
        queue.enqueue(6,false); // normal
        queue.enqueue(7,false); // normal
        queue.enqueue(8,false); // normal

        for (int i = 1; i <= 9; i++){
            System.out.println("Atendimento "+i+" : "+queue.serveNext());
        }
    }
}
