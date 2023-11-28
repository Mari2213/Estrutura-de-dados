package Execicios.ExeSaladeAula1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ControleAgenda agenda = new ControleAgenda(100);
        /*Scanner sc = new Scanner(System.in);

        int op;

        do {
            System.out.println("////////////////////MENU/////////////////////////");
            System.out.println("1 - Adicionar contato no final da agenda");
            System.out.println("2 - Adicionar contato por posição na agenda");
            System.out.println("3 - Remover contato da agenda");
            System.out.println("4 - Informar a quantidade de contatos existentes na agenda");
            System.out.println("5 - Verificar se um determinado contato existe na agenda");
            System.out.println("6 - Imprimir todos os contatos da agenda");
            System.out.println("7 - Imprimir todos os contatos (por letra informada) da agenda");
            System.out.println("0 - SAIR");
            System.out.print("Escolha uma das opções acima: ");
            op = sc.nextInt();

            switch (op){
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nome = sc.next();
                    System.out.print("Digite o número de telefone com o DD: ");
                    String cel = sc.next();
                    Contato c1 = new Contato(nome, cel);
                    agenda.adicionarContatoFinal(c1);
                    break;
                case 2:
                    System.out.print("Digite o nome do contato: ");
                    nome = sc.next();
                    System.out.print("Digite o número de telefone com o DD: ");
                    cel = sc.next();
                    System.out.print("Posição: ");
                    int pos = sc.nextInt();
                    Contato c2 = new Contato(nome, cel);
                    agenda.adiconarContatoPosicao(pos, c2);
                    break;
                case 3:
                    System.out.print("Digite o nome a ser excluído: ");
                    nome = sc.next();
                    agenda.excluirContato(nome);
                    break;
                case 4:
                    agenda.qtdContatos();
                    break;
                case 5:
                    System.out.print("Digite o nome que deseja procurar na agenda: ");
                    nome = sc.next();
                    agenda.buscarContato(nome);
                    break;
                case 6:
                    agenda.imprimir();
                    break;
                case 7:
                    System.out.print("Digite a letra inicial do contato para achar: ");
                    char letra = sc.next().charAt(0);
                    agenda.imprimirContatoPorLetra(letra);
                    break;
                case 0:
                    System.out.println("Saindo do programa!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente os números de 1 a 7. Caso queria encerrar digite o 0!");
            }
        }while (op != 0);

        sc.close();*/

        Contato c1 = new Contato("Davi", "(62)98590-0019");
        Contato c2 = new Contato("Alberto", "(62)98112-0202");
        Contato c3 = new Contato("Eduardo", "(62)99152-1219");
        Contato c4 = new Contato("Carlos", "(62)99152-1219");
        Contato c5 = new Contato("Maria", "(62)98155-1616");
        Contato c6 = new Contato("Frederico", "(62)98112-1717");
        Contato c7 = new Contato("Ornelas", "(62)98123-4224");

        Contato c8 = new Contato("Ricardo", "(62)98511-1010");
        Contato c9 = new Contato("Henrique", "(62)98516-1990");
        Contato c10 = new Contato("Pedro", "(62)98596-0111");

        agenda.adicionarContatoFinal(c1);
        agenda.adicionarContatoFinal(c2);
        agenda.adicionarContatoFinal(c3);
        agenda.adicionarContatoFinal(c4);
        agenda.adicionarContatoFinal(c5);
        agenda.adicionarContatoFinal(c6);
        agenda.adicionarContatoFinal(c7);
        System.out.println();
        agenda.imprimir();
        agenda.qtdContatos();
        System.out.println();

        agenda.excluirContato("Davi"); //Davi
        agenda.excluirContato("Eduardo"); //Eduardo
        System.out.println();

        agenda.imprimir();
        agenda.qtdContatos();
        System.out.println();

        agenda.adiconarContatoPosicao(1, c8); //Ricardo
        agenda.adiconarContatoPosicao(3, c9); //Henrique
        agenda.adiconarContatoPosicao(6, c10); //Pedro
        agenda.imprimir();
        agenda.qtdContatos();
        System.out.println();

        agenda.imprimirContatoPorLetra('A');
        agenda.imprimirContatoPorLetra('G');
        System.out.println();


        agenda.buscarContato("Ricardo");
        System.out.println();

        agenda.imprimir();
        agenda.qtdContatos();
        System.out.println();

        agenda.excluirContato("Ornelas");
        agenda.excluirContato("Henrique");
        System.out.println();

        agenda.imprimir();
        agenda.qtdContatos();

    }
}
