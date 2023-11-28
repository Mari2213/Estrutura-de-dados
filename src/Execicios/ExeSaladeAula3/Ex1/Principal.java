package Execicios.ExeSaladeAula3.Ex1;


public class Principal {
    public static void main(String[] args) {
        Lista list = new Lista();

        No n1 = new No(22);
        No n2 = new No(23.5);
        No n3 = new No(27);
        No n4 = new No(6);
        No n5 = new No(2);
        No n6 = new No(262);
        No n7 = new No(122);

        /*list.insereFinal(n1);
        list.insereFinal(n2);
        list.insereFinal(n3);
        list.insereFinal(n4);
        list.insereFinal(n5);
        list.insereFinal(n6);*/

        list.imprimir();

        list.adicionarPosicao(n7, 0);
        list.adicionarPosicao(n1, 0);
        list.adicionarPosicao(n2, 2);
        list.adicionarPosicao(n3, 1);

        list.imprimir();

        list.removePosicao(122,2);
        list.removePosicao(22,0);
        list.removePosicao(27,0);
        list.removePosicao(23.5,0);

        list.imprimir();
    }
}
