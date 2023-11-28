package Execicios.ExeSaladeAula4;

public class Principal {
    public static void main(String[] args) {
        Lista list = new Lista();

        No n1 = new No(1,'V');
        No n2 = new No(2, 'V');
        No n3 = new No(3,'A');
        No n4 = new No(4,'V');
        No n5 = new No(5,'A');
        No n6 = new No(6,'A');
        No n7 = new No(7,'V');
        No n8 = new No(8,'A');

        list.inserir(n1); //1
        list.inserir(n2); //2
        list.inserir(n3); //3
        list.inserir(n4); //4
        list.inserir(n5); //5
        list.inserir(n6); //6
        list.inserir(n7); //7
        list.inserir(n8); //8

        list.imprimir();
    }
}