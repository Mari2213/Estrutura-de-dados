package Execicios.ExeSaladeAula6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        Tree arv = new Tree();

        int op;
        long x;

        System.out.println("Árvore binaria de long");

        do {
            System.out.println("***********************************");
            System.out.println("Entre com a opcao");
            System.out.println("1: Inserir");
            System.out.println("2: Excluir");
            System.out.println("3: Pesquisar");
            System.out.println("4: Exibir");
            System.out.println("5: Sair do programa");
            System.out.println("***********************************");
            System.out.print("Escolha uma opção: ");
            op = le.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.print("Informe o valor (long): ");
                    x = le.nextLong();
                    arv.insert(x);
                }
                case 2 -> {
                    System.out.print("Informe o valor (long): ");
                    x = le.nextLong();
                    if (!arv.delete(x))
                        System.out.print("Valor nao encontrado!");
                    ;
                }
                case 3 -> {
                    System.out.print("Informe o valor (long): ");
                    x = le.nextLong();
                    if (arv.search(x) != null)
                        System.out.print("Valor Encontrado");
                    else
                        System.out.print("Valor nao encontrado!");
                }
                case 4 -> {
                    arv.walk();
                }
            } // fim switch
        } while(op != 5);
    }
}
