package Execicios.Exercicio2.Ex1;

public class Principal {
    public static void main(String[] args) {
        Lista lista = new Lista();

        No n1 = new No(12);
        No n2 = new No(13);
        No n3 = new No(54);
        No n4 = new No(43);

        lista.inserirFinal(n1);
        lista.inserirFinal(n2);
        lista.inserirFinal(n3);
        lista.inserirFinal(n4);
        lista.imprimir();

        lista.calcularMedia();
        lista.antecessorSucessor(n4);
    }
}
